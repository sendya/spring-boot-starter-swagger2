package io.tooko.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@EnableSwagger2
public class Swagger2AutoConfiguration {

    @Autowired
    private Swagger2Properties swagger2Properties;

    @Bean
    public Docket createRestApi() {

        if (swagger2Properties.isAllow()) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .host(swagger2Properties.getHost())
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage(swagger2Properties.getBasePackage()))
                    .paths(PathSelectors.any())
                    .build();
        }

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("", "", "", "", new Contact("", "", ""), "", "", null))
                .select()
                .apis(RequestHandlerSelectors.none())
                .paths(PathSelectors.none())
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swagger2Properties.getTitle())
                .description(swagger2Properties.getDescription())
                .version(swagger2Properties.getVersion())
                .contact(new Contact(swagger2Properties.getContact(), "", ""))
                .termsOfServiceUrl(swagger2Properties.getServiceUrl())
                .build();
    }
}
