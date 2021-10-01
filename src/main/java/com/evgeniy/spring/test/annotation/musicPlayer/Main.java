package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationContext.xml"
        );
        PC pc = context.getBean(PC.class);
        System.out.println(pc);
    }
}
