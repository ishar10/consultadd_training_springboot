package com.consultadd.controller;

import java.util.*;

import com.consultadd.model.Employee;
import com.consultadd.repository.EmployeeRepository;
import com.consultadd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        List<Employee> employeeList= employeeService.getEmployees();
        return employeeList;

    }
    @PostMapping("/addemp")
    public String saveEmployees(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }
    @PostMapping("/deleteemp")
    public String deleteEmployees(@RequestBody Employee employee)
    {
        return employeeService.deleteEmployee(employee);
    }

    @PostMapping("/updateemp")
    public String updateemployees(@RequestBody Employee employee)
    {
        return employeeService.updateemployee(employee);
    }



}
