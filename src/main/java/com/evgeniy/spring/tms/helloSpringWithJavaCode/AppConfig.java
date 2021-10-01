package com.evgeniy.spring.tms.helloSpringWithJavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "helloSpringBean")
    public HelloSpring getHelloSpring(){
        return new HelloSpring();
    }
}
