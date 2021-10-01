package com.evgeniy.spring.test.xml.helloSpring;

public class TestBean {
    private String name;

//    Если создаём конструктор, то прописываем его как аргумент в xml
//    public TestBean(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
