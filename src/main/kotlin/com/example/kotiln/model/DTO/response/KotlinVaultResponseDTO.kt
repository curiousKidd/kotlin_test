package com.example.kotiln.model.DTO.response

data class KotlinVaultResponseDTO(
    var request_id: String,
    val lease_id: String,
    val renewable: String,
    val lease_duration: String
)
