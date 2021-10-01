package com.evgeniy.spring.tms.helloSpringWithJavaCode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloSpring helloSpring = context.getBean("helloSpringBean", HelloSpring.class);
        helloSpring.setName("Hello Spring!");
        System.out.println(helloSpring.getName());

    }
}
