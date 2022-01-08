package com.consultadd.mysql.repository;

import com.consultadd.mysql.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
