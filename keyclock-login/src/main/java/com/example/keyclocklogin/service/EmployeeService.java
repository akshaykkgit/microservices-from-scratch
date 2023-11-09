package com.example.keyclocklogin.service;

import com.example.keyclocklogin.entity.Employee;
import com.example.keyclocklogin.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostConstruct
    public void initializeRepo() {
         employeeRepository.saveAll(
           List.of(
                   new Employee("Akshay",10000.00),
                   new Employee("Umaib",11000.00)
           )
         );

    }
    public List<Employee>  getAllEMployeese(){
        return employeeRepository.findAll();
    }
    public Employee getEmpById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }
}
