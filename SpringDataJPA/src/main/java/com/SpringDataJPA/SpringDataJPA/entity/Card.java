package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue(value = "viaCard")
public class Card extends Payment{
    String cardNumber;

}
