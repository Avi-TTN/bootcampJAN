package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "paymentVia", discriminatorType = DiscriminatorType.STRING)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long amount;
}
