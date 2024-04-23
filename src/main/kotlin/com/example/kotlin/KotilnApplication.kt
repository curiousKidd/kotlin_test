package com.example.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.FeignClient

@FeignClient
@SpringBootApplication
class KotilnApplication

fun main(args: Array<String>) {
    println(12312312)
    runApplication<KotilnApplication>(*args)
}
