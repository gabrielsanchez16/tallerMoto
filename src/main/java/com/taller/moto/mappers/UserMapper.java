package com.taller.moto.mappers;

import org.mapstruct.Mapper;
import com.taller.moto.dto.UserDto;
import com.taller.moto.models.Users;

@Mapper(componentModel = "spring")
public interface UserMapper {

    Users toUsers(UserDto usuerDto);

    UserDto toUserDto(Users users);

}
