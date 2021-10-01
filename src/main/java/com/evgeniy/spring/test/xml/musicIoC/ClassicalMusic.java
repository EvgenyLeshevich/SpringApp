package com.evgeniy.spring.test.xml.musicIoC;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "song Beethoven";
    }
}
