package com.RestfulWebServices1.RestfulWebService.service;

import com.RestfulWebServices1.RestfulWebService.entity.Employee;
import com.RestfulWebServices1.RestfulWebService.exception.ResourceNotFound;
import com.RestfulWebServices1.RestfulWebService.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDataLoaderService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getList(){
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Employee not found with id : " + id));
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void removeEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public void updateEmployeeAgeById(Long id, Integer age){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Employee not found with id : " + id));
        employee.setAge(age);
        employeeRepository.save(employee);
    }

}
