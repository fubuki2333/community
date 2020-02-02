## 比利社区

##部署
### 依赖
- Git
- JDK
- Maven
- MySQL
##步骤
- yum update
- yum install git
- mkdir App
- cd App
- git clone git@github.com:fubuki2333/community.git
- yum install maven
- mvn -v
- mvn compile package
- cp src/main/resources/application.properties src/main/resources/application-production.properties
- vim src/main/resources/application-production.properties
- mvn package
- java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar


## 资料
[Spring 文档](https://spring.io/guides)  
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[es](https://elasticsearch.cn/explore)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[BootStrap](https://v3.bootcss.com/getting-started/)  
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#what-kind-of-templates-can-thymeleaf-process)  
[SpringMVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-config-interceptors)  
[Markdown 插件](http://editor.md.ipandao.com/)  
[UFile SDK](https://github.com/ucloud/ufile-sdk-java)

## 工具
[Git](http://git-scm.com/download)  
[Visual Paradigm](https://www.visual-paradigm.com)
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://projectlombok.org/)


## 脚本
```sql
create table user
(
    id           int auto_increment primary key,
    account_id   varchar(100)       null,
    name         varchar(50)        null,
    token        char(36)           null,
    gmt_create   bigint             null,
    gmt_modified bigint             null
);
```
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```