package com.example.kotiln.service;

import com.example.kotiln.model.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Page<Employee> getEmployees();

    List<Employee> getEmployeesByLimit();
}
