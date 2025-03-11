package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Page<Employee> findAll(Pageable pageable);
    public Employee findByName(String Name);
    public List<Employee> findAllByNameStartingWith(String str);
    public  List<Employee> findByAgeBetween(Integer lowerBound, Integer upperBound);
}
