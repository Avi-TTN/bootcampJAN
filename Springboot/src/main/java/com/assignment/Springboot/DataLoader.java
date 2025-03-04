package com.assignment.Springboot;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DataLoader {
    private final EmployeeRepository repository;

    public DataLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void loadData() {
        repository.saveAll(List.of(
                new Employee("Avi", "Software Engineer"),
                new Employee("Abhinav", "Software Developer")
        ));
    }


}
