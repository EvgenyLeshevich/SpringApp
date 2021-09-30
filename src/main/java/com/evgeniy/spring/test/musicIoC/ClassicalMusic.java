package com.evgeniy.spring.test.musicIoC;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "song Beethoven";
    }
}
