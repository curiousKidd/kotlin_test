package com.example.kotlin.model.DTO

data class VaultAuthKotlinDTO(
    var client_token: String? = null,
    val accessor: String? = null,
    val policies: List<String>? = null,
    val metadata: Metadata? = null,
    val leaseDuration: String? = null,
    val renewable: String? = null,
    val entity_id: String? = null,

//    @lombok.Getter @Setter
//    class Metadata {
//    private val approle_id: String? = null
//    private val approle_no: String? = null
//    private val roleName: String? = null
//    private val secret_id_name: String? = null
//}
)
