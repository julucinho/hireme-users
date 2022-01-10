package com.capitolio.hiremeusers.services.impl;

import com.capitolio.hiremeusers.repositories.UsersRepository;
import com.capitolio.hiremeusers.services.DeletingUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletingUsersServiceImpl implements DeletingUsersService {

    private final UsersRepository usersRepository;

    @Override
    public void deleteUserBy(Long id) {
        this.usersRepository.deleteById(id);
    }
}
