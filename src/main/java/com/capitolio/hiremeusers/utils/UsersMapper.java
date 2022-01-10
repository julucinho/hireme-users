package com.capitolio.hiremeusers.utils;

import com.capitolio.hiremeusers.dtos.UserDto;
import com.capitolio.hiremeusers.entities.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsersMapper {

    public static UserEntity toEntity(UserDto userDto){
        return Mapper.map(userDto).to(UserEntity.class);
    }

    public static UserDto toDto(UserEntity userEntity){
        return Mapper.map(userEntity).to(UserDto.class);
    }

}
