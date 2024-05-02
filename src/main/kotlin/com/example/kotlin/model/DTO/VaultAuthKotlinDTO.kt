package com.example.kotlin.model.DTO

data class VaultAuthKotlinDTO(
    var client_token: String? = null,
    val accessor: String? = null,
    val policies: List<String>? = null,
    val metadata: AuthMetadata? = null,
    val leaseDuration: String? = null,
    val renewable: String? = null,
    val entity_id: String? = null,
)

data class AuthMetadata(
    val approle_id: String? = null,
    val approle_no: String? = null,
    val roleName: String? = null,
    val secret_id_name: String? = null
)
