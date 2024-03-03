package com.spring.employeemanager.repository;

import com.spring.employeemanager.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    void deleteEmployeeById(Long id);
}
