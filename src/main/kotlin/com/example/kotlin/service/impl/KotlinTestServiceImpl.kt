package com.example.kotlin.service.impl

import com.example.kotlin.model.DTO.response.VaultResponseDTO
import com.example.kotlin.model.DTO.resquest.VaultRequestDTO
import com.example.kotlin.service.TestService
import org.springframework.beans.factory.annotation.Value

class KotlinTestServiceImpl : TestService {

    @Value("\${spring.cloud.vault.app-role.role-id}")
    private val roleId: String? = null

    @Value("\${spring.cloud.vault.app-role.secret-id}")
    private val secretId: String? = null


    override fun getAuthToken(): VaultResponseDTO {
        TODO("Not yet implemented")
        val vaultRequestDTO = VaultRequestDTO.builder()
            .role_id(roleId)
            .secret_id(secretId)
            .build()

        return vaultFeignClient.getAuthToken(vaultRequestDTO)
    }

    override fun getSecretData(): VaultResponseDTO {
        TODO("Not yet implemented")

        val vaultRequestDTO = VaultRequestDTO.builder()
            .role_id(roleId)
            .secret_id(secretId)
            .build()

        val token: VaultResponseDTO = vaultFeignClient.getAuthToken(vaultRequestDTO)
        val client_token = token.auth.client_token

        val secretData: VaultResponseDTO = vaultFeignClient.getSecretData(client_token)

        return secretData
    }
}