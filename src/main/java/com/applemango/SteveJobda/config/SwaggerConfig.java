package com.applemango.SteveJobda.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
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
                .ignoredParameterTypes(HttpSession.class, HttpServletRequest.class);
        /* 로그인에 사용하는 session 관련 매개변수는 swagger에서 무시하도록 설정 */
    }

}
