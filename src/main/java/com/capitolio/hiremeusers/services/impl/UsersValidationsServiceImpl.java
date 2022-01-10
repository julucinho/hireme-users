package com.capitolio.hiremeusers.services.impl;

import com.capitolio.hiremeusers.entities.UserEntity;
import com.capitolio.hiremeusers.exceptions.IdNotPresentException;
import com.capitolio.hiremeusers.exceptions.UserNotFoundByIdException;
import com.capitolio.hiremeusers.services.RetrievingUsersService;
import com.capitolio.hiremeusers.services.UsersValidationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Optional.ofNullable;

@Service
@RequiredArgsConstructor
public class UsersValidationsServiceImpl implements UsersValidationsService {

    private final RetrievingUsersService retrievingUsersService;

    @Override
    public void validateBeforeUpdating(UserEntity userToBeUpdated) {
        ofNullable(userToBeUpdated.getId()).orElseThrow(IdNotPresentException::new);
        this.retrievingUsersService.retrieveUserBy(userToBeUpdated.getId()).orElseThrow(() -> new UserNotFoundByIdException(userToBeUpdated.getId()));
    }
}
