package com.evgeniy.spring.test.annotation.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String song() {
        return "Rock music";
    }
}
