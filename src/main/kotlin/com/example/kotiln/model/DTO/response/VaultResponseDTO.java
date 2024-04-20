package com.example.kotiln.model.DTO.response;

import com.example.kotiln.model.DTO.VaultAuthDTO;
import com.example.kotiln.model.DTO.VaultDataDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VaultResponseDTO {

    private String request_id;
    private String lease_id;
    private String renewable;
    private String lease_duration;
    private VaultDataDTO data;
    private VaultAuthDTO auth;

}
