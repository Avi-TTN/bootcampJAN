package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jdk.jfr.Enabled;

@Entity
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue(value = "viaUPI")
public class Upi extends Payment {
    String upiID;

}
