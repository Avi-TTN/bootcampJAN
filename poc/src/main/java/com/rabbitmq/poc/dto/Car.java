package com.rabbitmq.poc.dto;

import lombok.Data;

@Data
public class Car {
    private String name;
    private String brand;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
