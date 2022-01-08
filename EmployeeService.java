package com.consultadd.service;

import com.consultadd.model.Employee;
import com.consultadd.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        List<Employee> employeeList= employeeRepository.findAll();
        return employeeList;
    }
    public String saveEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId())) {
            return "Couldn't save data.Id already exists.";
        }
        else
        {
            employeeRepository.save(employee);
            return "Employee data saved successfully";
        }

    }
    public String deleteEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId())) {
            employeeRepository.delete(employee);
            return "Employee data deleted successfully";

        }
        else
        {
            return "Couldn't delete data.Id don't exists.";
        }

    }
    public String updateemployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId())) {
            int a= employee.getAge();
            String b= employee.getName();
            employee.setAge(a);
            employee.setName(b);
            employeeRepository.save(employee);
            return "employee data updated successfully";

        }
        else
        {
            return "Couldn't update data.Id don't exists.";
        }

    }

}
