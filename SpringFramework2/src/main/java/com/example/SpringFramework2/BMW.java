package com.example.SpringFramework2;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car{

    @Override
    public void newCar() {
        System.out.println("A BMW with Hashcode : " + System.identityHashCode(this));
    }
}
