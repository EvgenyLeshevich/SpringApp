package com.evgeniy.spring.test.javaCode.musicPlayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.evgeniy.spring.test.javaCode.musicPlayer")
@PropertySource("classpath:playerWithJavaCode.properties")
public class Config {
}
