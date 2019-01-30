package com.mm;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class SwaggerApp {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApp.class, args);
    }
}