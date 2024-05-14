package com.example.kotlin.v1.model.entity

import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Table(name = "employees")
data class EmployeeKotlin(
    @Id
    val emp_no: String? = null,
    val birth_date: LocalDate? = null,
    val first_name: String? = null,
    val last_name: String? = null,
    val gender: String? = null,
    val hire_date: LocalDate? = null
)
