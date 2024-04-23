package com.example.kotlin.service;

import kakao.aisp.javavaultconnecttest.model.DTO.response.VaultResponseDTO;

public interface TestService {

    VaultResponseDTO getAuthToken();

    VaultResponseDTO getSecretData();

}
