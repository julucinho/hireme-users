package com.capitolio.hiremeusers.services;

import com.capitolio.hiremeusers.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface SavingUsersService {
    UserEntity saveNew(UserEntity toEntity);
    void save(UserEntity userToBeUpdated);
}
