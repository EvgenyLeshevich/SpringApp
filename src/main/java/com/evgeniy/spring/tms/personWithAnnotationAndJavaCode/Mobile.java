package com.evgeniy.spring.tms.personWithAnnotationAndJavaCode;

import org.springframework.stereotype.Component;

@Component
public class Mobile implements ElectronicDevices{

    @Override
    public void turnOn() {
        System.out.println("Turning on the mobile phone.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the mobile phone.");
    }
}
