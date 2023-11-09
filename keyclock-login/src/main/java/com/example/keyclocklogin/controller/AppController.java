package com.example.keyclocklogin.controller;

import com.example.keyclocklogin.entity.Employee;
import com.example.keyclocklogin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String home() {
        return "Home";
    }

    @GetMapping("/allEmployeese")
    @PreAuthorize("hasRole('ROLE_admin')")
    public ResponseEntity<List<Employee>> getAllEmp() {
        return ResponseEntity.ok(employeeService.getAllEMployeese());
    }

    @GetMapping("/getEmpById/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(employeeService.getEmpById(id));
    }
}
