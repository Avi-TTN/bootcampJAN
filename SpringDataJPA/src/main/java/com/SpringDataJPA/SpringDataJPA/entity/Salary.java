package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    Integer basicSalary;
    Integer bonusSalary;
    Integer taxAmount;
    Integer specialAllowanceSalary;
}
