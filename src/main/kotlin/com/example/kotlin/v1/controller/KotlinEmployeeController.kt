package com.example.kotlin.v1.controller

import com.example.kotlin.v1.model.entity.Employee
import com.example.kotlin.v1.service.impl.KotlinEmployeeServiceImpl
import lombok.RequiredArgsConstructor
import org.springframework.data.domain.Page
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/kotlin/employees")
class KotlinEmployeeController(private var kotlinEmployeeServiceImpl: KotlinEmployeeServiceImpl) {

    @GetMapping("/")
    fun getEmployees(): ResponseEntity<Page<Employee>> {
        return ResponseEntity.ok().body<Page<Employee>>(kotlinEmployeeServiceImpl.getEmployees())
    }

    @GetMapping("/limit")
    fun getEmployeesByLimit(): ResponseEntity<List<Employee>> {
        return ResponseEntity.ok().body<List<Employee>>(kotlinEmployeeServiceImpl.getEmployeesByLimit())
    }

}