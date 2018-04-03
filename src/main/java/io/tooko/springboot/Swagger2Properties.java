package io.tooko.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="spring.boot.swagger2")
public class Swagger2Properties {

    private boolean allow;

    private String basePackage;
    private String title;
    private String description;
    private String serviceUrl;
    private String contact;
    private String version;
    private String host;

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Swagger2Properties{" +
                "allow=" + allow +
                ", basePackage='" + basePackage + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", serviceUrl='" + serviceUrl + '\'' +
                ", contact='" + contact + '\'' +
                ", version='" + version + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
