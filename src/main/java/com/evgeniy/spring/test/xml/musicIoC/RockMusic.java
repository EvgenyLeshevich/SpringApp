package com.evgeniy.spring.test.xml.musicIoC;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "song AC/DC";
    }
}
