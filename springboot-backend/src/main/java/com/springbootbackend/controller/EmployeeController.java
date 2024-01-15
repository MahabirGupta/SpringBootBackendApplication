package com.springbootbackend.controller;

import com.springbootbackend.model.Employee;
import com.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
//    Inject Employee Repository by Spring Container
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")//specify the url
//    Create method to get all employees
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}