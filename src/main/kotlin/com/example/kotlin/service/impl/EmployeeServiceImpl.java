package com.example.kotlin.service.impl;

import com.example.kotlin.model.entity.Employee;
import com.example.kotlin.repository.EmployeeRepository;
import com.example.kotlin.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getEmployees() {
        Pageable pageable = Pageable.ofSize(10);

        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> getEmployeesByLimit() {
        return employeeRepository.getEmployees(10);
    }
}
