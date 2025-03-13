package com.SpringDataJPA.SpringDataJPA.repository;

import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    @Query("SELECT e.firstName, e.lastName FROM Employee e " +
//            "WHERE e.salary > (Select AVG(e2.salary) FROM Employee e2) " +
//            "ORDER BY e.age ASC, e.salary DESC")
//    List<Object[]> findBySalaryAboveAverageOrderByAgeAscSalaryDesc();
//
//    @Modifying
//    @Transactional
//    @Query("UPDATE Employee e SET e.salary = :newSalary " +
//            "WHERE e.salary < :avgSalary")
//    void updateSalaryLessThanAverageSalary(@Param("newSalary") Integer newSalary, @Param("avgSalary") Integer avgSalary);
//
//    @Query("Select AVG(e2.salary) FROM Employee e2")
//    Integer avgSalary();
//
//    @Modifying
//    @Transactional
//    @Query("DELETE FROM Employee e WHERE e.salary = :minSalary")
//    Integer deleteEmployeeWithMinimumSalary(@Param("minSalary") Integer minSalary);
//
//    @Query("Select MIN(e.salary) FROM Employee e")
//    Integer minSalary();
//
//    @Query(nativeQuery = true, value = "SELECT empId, empFirstName, empAge FROM employeeTable WHERE empLastName = 'Singh'")
//    List<Object[]> findByLastNameAsSingh();
//
//    @Modifying
//    @Transactional
//    @Query(nativeQuery = true, value = "DELETE FROM employeeTable WHERE empAge > :age")
//    void deleteEmployeeWithAgeGreaterThan(@Param("age") Integer age);
}
