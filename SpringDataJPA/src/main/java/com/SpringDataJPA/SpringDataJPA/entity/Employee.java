
package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {
    Employee(){};
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    Long id;
    @Column(name = "empFirstName")
    String firstName;
    @Column(name = "empLastName")
    String lastName;
//    @Column(name = "empSalary")
//    Integer salary;
    @Embedded
    Salary salary;
    @Column(name = "empAge")
    Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Integer getSalary() {
//        return salary;
//    }

//    public void setSalary(Integer salary) {
//        this.salary = salary;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
