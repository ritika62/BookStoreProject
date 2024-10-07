package com.ritika.springboot;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//http://localhost:2222/swagger-ui/index.html
@SpringBootApplication
public class WebConfig implements WebMvcConfigurer {

    private ApiInfo apiInfoMetaData() {
        return new ApiInfoBuilder()
                .title("BookStore API")
                .description("BookSearchMS API - part of BookStore")
                .contact(new Contact("Ritika", "https://www.apple.com", "rit@gmail.com"))
                .license("API Under Free Licence")
                .licenseUrl("https://www.apple.com")
                .version("3.1")
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ritika.springboot"))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .apiInfo(apiInfoMetaData());
    }
}

