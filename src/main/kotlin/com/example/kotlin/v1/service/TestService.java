package com.example.kotlin.v1.service;

import com.example.kotlin.v1.model.DTO.response.VaultResponseDTO;

public interface TestService {

    VaultResponseDTO getAuthToken();

    VaultResponseDTO getSecretData();

}
