Springboot api docs for Swagger2
====



Overview
----

项目提供标准化 `SpringBoot` 方式引入 `Swagger UI` 在线文档生成支持库




- 配置说明
```yml
spring:
  boot:
    # 请注意,配置项必须在 spring.boot 节点下
    # 如: spring.boot.swagger2.allow = true
    swagger2:
      allow: true
      # api 文档注解扫描路劲
      base-package: com.example.web.api.controller
      # 文档名称
      title: DEMO-API-DOCS
      # 说明
      description: springboot api docs for swagger2
      # 服务提供地址
      service-url: http://127.0.0.1:8080
      # 联系方式
      contact:
      # api 当前版本
      version: 1.0.0
      # api 提供主机
      host: 127.0.0.1:8080
```



- maven 私服配置例子
```xml
    <distributionManagement>
        <repository>
            <id>nexus-releases</id>
            <name>Nexus Release Repository</name>
            <url>http://server:port/nexus/content/repositories/releases/</url>
        </repository>
        <snapshotRepository>
            <id>nexus-snapshots</id>
            <name>Nexus Snapshot Repository</name>
            <url>http://server:port/nexus/content/repositories/snapshots/</url>
        </snapshotRepository>
    </distributionManagement>
```