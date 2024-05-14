package com.example.kotlin.v1.model.DTO

data class VaultDataKotlinDTO(
    var data: Data? = null,
    val metadata: Metadata? = null
)

data class Data(
    val age: String? = null,
    val name: String? = null
)

data class Metadata(
    val created_time: String? = null,
    val custom_metadata: String? = null,
    val deletion_time: String? = null,
    val destroyed: String? = null,
    val version: String? = null
)
