package com.example.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class VariableTest {

    @Test
    fun variableExam() {
        val message: String

        val b = true

        message = if (b) {
            "true"
        } else {
            "false"
        }

        Assertions.assertTrue(message == "true")
    }
}