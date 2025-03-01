package com.example.SpringFramework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
//    public Car getCar(String string) throws Exception {
//        if (string.equals("Mercedes")){
//            return new Mercedes();
//        }
//        else if(string.equals("BMW")){
//            return new BMW();
//        }
//        else {
//            throw new Exception("Not a valid type of car");
//        }
//    }

    private final Car car;

//    @Autowired
    public CarFactory(@Qualifier("BMW") Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
