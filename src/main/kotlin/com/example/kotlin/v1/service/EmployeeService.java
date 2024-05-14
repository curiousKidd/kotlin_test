package com.example.kotlin.v1.service;

import com.example.kotlin.v1.model.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Page<Employee> getEmployees();

    List<Employee> getEmployeesByLimit();
}
