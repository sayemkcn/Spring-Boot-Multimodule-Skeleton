package com.example.multimoduleapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"dev.sayem"})
//@ComponentScan(basePackages = {"dev.sayem"})
public class MultiModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleApplication.class, args);
    }

}
