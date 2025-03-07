package com.RestfulWebService2.RestfulWebService.repository;

import com.RestfulWebService2.RestfulWebService.entity.Employee;
import com.RestfulWebService2.RestfulWebService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
