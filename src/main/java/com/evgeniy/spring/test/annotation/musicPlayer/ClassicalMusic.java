package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    @Override
    public String song() {
        return "Classical music.";
    }
}
