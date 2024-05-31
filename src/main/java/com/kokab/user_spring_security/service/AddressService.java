package com.kokab.user_spring_security.service;

import com.kokab.user_spring_security.shared.dto.AddressDTO;

import java.util.List;


public interface AddressService {
    List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);
}