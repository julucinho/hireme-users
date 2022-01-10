package com.capitolio.hiremeusers.services;

import com.capitolio.hiremeusers.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RetrievingUsersService {
    Optional<UserEntity> retrieveUserBy(Long id);
    Page<UserEntity> retrieveUsersBy(Integer pageNumber, Integer pageSize);
}
