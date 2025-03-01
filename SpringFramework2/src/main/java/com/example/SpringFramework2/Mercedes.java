package com.example.SpringFramework2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mercedes implements Car{

    @Override
    public void newCar() {
        System.out.println("A Mercedes with Hashcode : " + System.identityHashCode(this));
    }
}
