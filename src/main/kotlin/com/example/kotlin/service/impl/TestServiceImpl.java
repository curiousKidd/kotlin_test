package com.example.kotlin.service.impl;

import com.example.kotlin.model.DTO.response.VaultResponseDTO;
import com.example.kotlin.model.DTO.resquest.VaultRequestDTO;
import com.example.kotlin.service.TestService;
import com.example.kotlin.serviceClient.VaultFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService VaultFeignClient vaultFeignClient {

    private final VaultFeignClient vaultFeignClient;

    @Value("${spring.cloud.vault.app-role.role-id}")
    private String roleId;

    @Value("${spring.cloud.vault.app-role.secret-id}")
    private String secretId;

    public VaultResponseDTO getAuthToken() {

        VaultRequestDTO vaultRequestDTO = VaultRequestDTO.builder()
                .role_id(roleId)
                .secret_id(secretId)
                .build();

        return vaultFeignClient.getAuthToken(vaultRequestDTO);
    }

    @Override
    public VaultResponseDTO getSecretData() {

        VaultRequestDTO vaultRequestDTO = VaultRequestDTO.builder()
                .role_id(roleId)
                .secret_id(secretId)
                .build();

        VaultResponseDTO token = vaultFeignClient.getAuthToken(vaultRequestDTO);
        String client_token = token.getAuth().getClient_token();

        VaultResponseDTO secretData = vaultFeignClient.getSecretData(client_token);

        return secretData;
    }
}
