package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.SpringDataJPA.SpringDataJPA.repository.EmployeeRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void updateEmployeeAge(Long id, Integer newAge){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Enployee does not exist with id: "+ id));
        employee.setAge(newAge);
        employeeRepository.save(employee);
    }

    public Employee readEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Enployee does not exist with id: "+ id));
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public Long totalCount(){
        return employeeRepository.count();
    }

    public List<Employee> ageSortedList(Integer pageNumber, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("age"));
        return  employeeRepository.findAll(pageable).getContent();
    }

    public Employee byName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> startingWith(String str){
        return employeeRepository.findAllByNameStartingWith(str);
    }

    public List<Employee> ageBetween(Integer lowerBound, Integer upperBound){
        return employeeRepository.findByAgeBetween(lowerBound, upperBound);
    }


}
