package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    String streetNumber;
    String location;
    String state;

    public Address() {
    }

    public Address(String streetNumber, String state, String location) {
        this.streetNumber = streetNumber;
        this.state = state;
        this.location = location;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}