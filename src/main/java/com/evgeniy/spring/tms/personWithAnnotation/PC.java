package com.evgeniy.spring.tms.personWithAnnotation;

import org.springframework.stereotype.Component;

@Component
public class PC implements ElectronicDevices{
    @Override
    public void turnOn() {
        System.out.println("Turning on the PC.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the PC.");
    }
}
