package com.jarvis.java8.Features.controller;

import com.jarvis.java8.Features.ServiceImple.EmployeeService;
import com.jarvis.java8.Features.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() throws Exception {
        return service.getEmployees();
    }
}