package com.RestfulWebServices1.RestfulWebService.controller;

import com.RestfulWebServices1.RestfulWebService.entity.Employee;
import com.RestfulWebServices1.RestfulWebService.service.EmployeeDataLoaderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeDataLoaderService employeeDataLoaderService;

    @GetMapping("/list")
    public List<Employee> getEmployeeList(){
        return employeeDataLoaderService.getList();
    }

    @GetMapping("/byId/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeDataLoaderService.getEmployee(id);
    }

    @PostMapping("/add")
    public void addEmployee(@Valid @RequestBody Employee employee){
        employeeDataLoaderService.addEmployee(employee);
    }

    @DeleteMapping("/delete")
    public void removeEmployee(@RequestParam Long id){
        employeeDataLoaderService.removeEmployee(id);
    }

    @PutMapping("/update")
    public void updateEmployeeById(@RequestParam Long id, @RequestParam Integer age){
        employeeDataLoaderService.updateEmployeeAgeById(id, age);
    }


}
