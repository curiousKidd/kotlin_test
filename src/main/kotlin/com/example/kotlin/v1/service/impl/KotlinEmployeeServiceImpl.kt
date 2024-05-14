package com.example.kotlin.v1.service.impl

import com.example.kotlin.v1.model.entity.Employee
import com.example.kotlin.v1.repository.EmployeeRepository
import com.example.kotlin.v1.service.EmployeeService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class KotlinEmployeeServiceImpl(private var employeeRepository: EmployeeRepository) : EmployeeService {

    override fun getEmployees(): Page<Employee> {
        val pageable = Pageable.ofSize(10)

        return employeeRepository.findAll(pageable)
    }

    override fun getEmployeesByLimit(): List<Employee> {
        return employeeRepository.getEmployees(10)
    }

}