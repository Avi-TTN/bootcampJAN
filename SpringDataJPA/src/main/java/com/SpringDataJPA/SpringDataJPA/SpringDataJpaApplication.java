package com.SpringDataJPA.SpringDataJPA;

import com.SpringDataJPA.SpringDataJPA.entity.Address;
import com.SpringDataJPA.SpringDataJPA.entity.Author;
import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import com.SpringDataJPA.SpringDataJPA.repository.EmployeeRepository;
import com.SpringDataJPA.SpringDataJPA.service.AuthorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.SpringDataJPA.SpringDataJPA.service.EmployeeService;

import java.util.Arrays;

@SpringBootApplication
public class SpringDataJpaApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		AuthorService authorService = context.getBean(AuthorService.class);Address address1 = new Address("101", "Mumbai", "Maharashtra");
		Address address2 = new Address("202", "Bangalore", "Karnataka");
		Address address3 = new Address("303", "Delhi", "Delhi");

		Author author1 = new Author();
		author1.setAddress(address1);
		author1.setSubjects(Arrays.asList("Java", "Spring Boot", "Hibernate"));

		Author author2 = new Author();
		author2.setAddress(address2);
		author2.setSubjects(Arrays.asList("Python", "Django", "Machine Learning"));

		Author author3 = new Author();
		author3.setAddress(address3);
		author3.setSubjects(Arrays.asList("C++", "Data Structures", "Algorithms"));

		authorService.add(author1);
		authorService.add(author2);
		authorService.add(author3);
	}
}
