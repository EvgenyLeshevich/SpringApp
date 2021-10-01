package com.evgeniy.spring.tms.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Geometry geometry = context.getBean("geometry", Geometry.class);
        geometry.print();
    }
}
