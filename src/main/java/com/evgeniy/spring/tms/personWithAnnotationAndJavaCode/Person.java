package com.evgeniy.spring.tms.personWithAnnotationAndJavaCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Person {
    @Autowired
    private List<ElectronicDevices> electronicDevices = new ArrayList<>();

    public List<ElectronicDevices> getElectronicDevices() {
        return electronicDevices;
    }

    public void setElectronicDevices(List<ElectronicDevices> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public void turnOnDevices(){
        for (ElectronicDevices e:
             electronicDevices) {
            e.turnOn();
        }
    }
    public void turnOffDevices(){
        for (ElectronicDevices e:
                electronicDevices) {
            e.turnOff();
        }
    }
}
