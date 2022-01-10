package com.capitolio.hiremeusers.services;

import com.capitolio.hiremeusers.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UsersValidationsService {
    void validateBeforeUpdating(UserEntity userToBeUpdated);
}
