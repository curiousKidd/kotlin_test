package com.example.kotlin.v1.model.DTO.response

import com.example.kotlin.v1.model.DTO.VaultAuthDTO
import com.example.kotlin.v1.model.DTO.VaultDataDTO

data class VaultKotlinResponseDTO(
    private var request_id: String? = null,
    val lease_id: String? = null,
    val renewable: String? = null,
    val lease_duration: String? = null,
    val data: VaultDataDTO? = null,
    val auth: VaultAuthDTO? = null
)
