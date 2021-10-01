package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String song() {
        return "Classical music.";
    }
}
