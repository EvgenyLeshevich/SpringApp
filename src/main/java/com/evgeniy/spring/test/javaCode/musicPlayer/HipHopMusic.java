package com.evgeniy.spring.test.javaCode.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class HipHopMusic implements Music{
    @Override
    public String getSong() {
        return "Hip-Hop Music";
    }
}
