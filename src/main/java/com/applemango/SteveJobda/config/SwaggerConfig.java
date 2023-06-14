package com.applemango.SteveJobda.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket customApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .ignoredParameterTypes(HttpSession.class, HttpServletRequest.class)
                .apiInfo(getApiInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("SteveJobda API Documentation")
                .description("RESTFul API")
                .contact(new Contact("seungnong", "https://seungnong.tistory.com/", "jsw0824@midasin.com"))
                .version("0.0.1")
                .build();
    }

}
