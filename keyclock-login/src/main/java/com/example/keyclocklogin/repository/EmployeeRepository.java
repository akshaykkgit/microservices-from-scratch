package com.example.keyclocklogin.repository;

import com.example.keyclocklogin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
