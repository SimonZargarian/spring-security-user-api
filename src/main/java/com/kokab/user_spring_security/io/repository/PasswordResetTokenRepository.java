package com.kokab.user_spring_security.io.repository;

import com.kokab.user_spring_security.io.entity.PasswordResetTokenEntity;
import org.springframework.data.repository.CrudRepository;


public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
    PasswordResetTokenEntity findByToken(String token);
}