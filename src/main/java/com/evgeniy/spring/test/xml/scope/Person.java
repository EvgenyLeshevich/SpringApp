package com.evgeniy.spring.test.xml.scope;

public class Person {
    private String name;

    private Person() {
    }

    public static Person getPerson(){
        return new Person();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doMyInit(){
        System.out.println("Doing my init.");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy.");
    }
}
