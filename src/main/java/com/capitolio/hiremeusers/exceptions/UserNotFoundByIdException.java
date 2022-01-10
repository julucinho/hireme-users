package com.capitolio.hiremeusers.exceptions;

import lombok.Getter;

@Getter
public class UserNotFoundByIdException extends RuntimeException{

    public UserNotFoundByIdException(Long id){
        super("The user of id ".concat(id.toString()).concat( "wasn't found."));
    }

}
