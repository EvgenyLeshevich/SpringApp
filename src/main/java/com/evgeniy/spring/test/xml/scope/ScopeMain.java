package com.evgeniy.spring.test.xml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //При singleton-e не зависимо от того сколько раз мы вызовем бины,
        // наши переменные всегда будут указывать на один и тот же объект в памяти
        Person personOne = context.getBean("person", Person.class);
        Person personTwo = context.getBean("person", Person.class);
        boolean comparison = personOne == personTwo;
        System.out.println(comparison);

        System.out.println(personOne);
        System.out.println(personTwo);

        personOne.setName("E");
        personTwo.setName("Evgeniy");
        System.out.println(personOne.getName());
        System.out.println(personTwo.getName());
    }
}
