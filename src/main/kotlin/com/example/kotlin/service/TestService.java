package com.example.kotlin.service;

import com.example.kotlin.model.DTO.response.VaultResponseDTO;

public interface TestService {

    VaultResponseDTO getAuthToken();

    VaultResponseDTO getSecretData();

}
