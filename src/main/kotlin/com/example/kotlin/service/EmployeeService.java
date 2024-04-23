package com.example.kotlin.service;

import com.example.kotlin.model.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Page<Employee> getEmployees();

    List<Employee> getEmployeesByLimit();
}
