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

//    public void findBySalaryAboveAverageOrderByAgeAscSalaryDesc(){
//        for(Object[] arr: employeeRepository.findBySalaryAboveAverageOrderByAgeAscSalaryDesc()){
//            System.out.println("firstName : " + arr[0]+ " | lastName : " + arr[1]);
//        }
//    }
//
//    public void updateSalaryLessThanAverageSalary(Integer newSalary) {
//        Integer avgSalary = employeeRepository.avgSalary();
//        employeeRepository.updateSalaryLessThanAverageSalary(newSalary, avgSalary);
//    }
//
//    public void deleteEmployeeWithMinimumSalary(){
//        employeeRepository.deleteEmployeeWithMinimumSalary(employeeRepository.minSalary());
//    }
//
//    public void findByLastNameAsSingh(){
//        for(Object arr[] : employeeRepository.findByLastNameAsSingh()){
//            System.out.println("id : " + arr[0] + " | firstName : " + arr[1]+ " | age : " + arr[2]);
//        }
//    }
//
//    public void deleteEmployeeWithAgeGreaterThan(Integer age){
//        employeeRepository.deleteEmployeeWithAgeGreaterThan(age);
//    }

}
