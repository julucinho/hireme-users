package com.capitolio.hiremeusers.services.impl;

import com.capitolio.hiremeusers.entities.UserEntity;
import com.capitolio.hiremeusers.repositories.UsersRepository;
import com.capitolio.hiremeusers.services.SavingUsersService;
import com.capitolio.hiremeusers.services.UsersValidationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavingUsersServiceImpl implements SavingUsersService {

    private final UsersRepository usersRepository;
    private final UsersValidationsService usersValidationsService;

    @Override
    public UserEntity saveNew(UserEntity user) {
        return this.usersRepository.save(user);
    }

    @Override
    public void save(UserEntity userToBeUpdated) {
        this.usersValidationsService.validateBeforeUpdating(userToBeUpdated);
        this.usersRepository.save(userToBeUpdated);
    }
}
