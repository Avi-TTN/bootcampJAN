package com.RestfulWebService2.RestfulWebService.service;

import com.RestfulWebService2.RestfulWebService.entity.Employee;
import com.RestfulWebService2.RestfulWebService.exception.ResourceNotFound;
import com.RestfulWebService2.RestfulWebService.repository.EmployeeRepository;
import com.RestfulWebService2.RestfulWebService.entity.Employee;
import com.RestfulWebService2.RestfulWebService.exception.ResourceNotFound;
import com.RestfulWebService2.RestfulWebService.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
