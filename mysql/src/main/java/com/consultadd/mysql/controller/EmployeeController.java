package com.consultadd.mysql.controller;

import com.consultadd.mysql.model.Employee;
import com.consultadd.mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

