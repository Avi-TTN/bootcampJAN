package com.RestfulWebService2.RestfulWebService.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
//@JsonIgnoreProperties({"password"})
//@JsonFilter("employeeFilter")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonIgnore
    private Long id;
    @Size(max = 10, message = "Name cannot be bigger than 10 characters")
    private String name;
    @Min(value = 18, message = "User must be 18+")
    private Integer age;
//    @JsonIgnore
    private String password;

    public String getPassword() {
        return password;
    }
    @JsonIgnore
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
