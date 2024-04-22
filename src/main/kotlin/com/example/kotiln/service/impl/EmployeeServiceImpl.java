package com.example.kotiln.service.impl;

import com.example.kotiln.model.entity.Employee;
import com.example.kotiln.repository.EmployeeRepository;
import com.example.kotiln.service.EmployeeService;
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
