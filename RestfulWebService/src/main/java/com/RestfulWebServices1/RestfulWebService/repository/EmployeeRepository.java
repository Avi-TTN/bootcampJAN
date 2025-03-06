package com.RestfulWebServices1.RestfulWebService.repository;

import com.RestfulWebServices1.RestfulWebService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
