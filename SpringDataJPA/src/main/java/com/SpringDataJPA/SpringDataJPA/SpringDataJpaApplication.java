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
		//create
//		employeeService.createEmployee(new Employee("avi", 20, "Gurgaon"));

		//update
//		employeeService.updateEmployeeAge(1L,20);

		//read
//		System.out.println(employeeService.readEmployee(1L));

		//delete
//		employeeService.deleteEmployee(3L);

		//total count
//		System.out.println(employeeService.totalCount());

		//find all by age along with pagination and sorting
//		System.out.println(employeeService.ageSortedList(1,2));

		//find by name
//		System.out.println(employeeService.byName("abhinav"));

		//List of employees starting with 'a'
//		for(Employee e : employeeService.startingWith("a")){
//			System.out.println(e);
//		}

		//list of employees between age lowerBound and upperBound
		for(Employee e : employeeService.ageBetween(22, 25)){
			System.out.println(e);
		}
	}

}
