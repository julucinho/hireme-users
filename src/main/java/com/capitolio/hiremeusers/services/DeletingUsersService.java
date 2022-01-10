package com.capitolio.hiremeusers.services;

import org.springframework.stereotype.Service;

@Service
public interface DeletingUsersService {
    void deleteUserBy(Long id);
}
