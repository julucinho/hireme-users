package com.capitolio.hiremeusers.services.impl;

import com.capitolio.hiremeusers.entities.UserEntity;
import com.capitolio.hiremeusers.repositories.UsersRepository;
import com.capitolio.hiremeusers.services.RetrievingUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetrievingUsersServiceImpl implements RetrievingUsersService {

    private final UsersRepository usersRepository;

    @Override
    public Optional<UserEntity> retrieveUserBy(Long id) {
        return this.usersRepository.findById(id);
    }

    @Override
    public Page<UserEntity> retrieveUsersBy(Integer pageNumber, Integer pageSize) {
        return this.usersRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }
}
