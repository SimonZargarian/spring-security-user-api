package com.kokab.user_spring_security.io.repository;
import com.kokab.user_spring_security.io.entity.AddressEntity;
import com.kokab.user_spring_security.io.entity.UserEntity;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    List<AddressEntity> findAllByUserDetails(UserEntity userEntity);
    AddressEntity findByAddressId(String addressId);
}