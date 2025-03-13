package com.SpringDataJPA.SpringDataJPA;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import com.SpringDataJPA.SpringDataJPA.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.SpringDataJPA.SpringDataJPA.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		employeeService.findBySalaryAboveAverageOrderByAgeAscSalaryDesc();
//		employeeService.updateSalaryLessThanAverageSalary(50000);
//		employeeService.deleteEmployeeWithMinimumSalary();
//		employeeService.findByLastNameAsSingh();
//		employeeService.deleteEmployeeWithAgeGreaterThan(45);
	}
}
