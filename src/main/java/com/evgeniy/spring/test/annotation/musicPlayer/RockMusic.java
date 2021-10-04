package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my Init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }

    @Override
    public String song() {
        return "Rock music";
    }
}
