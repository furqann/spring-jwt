package com.eclat.mapper;

import com.eclat.dto.UserDto;
import com.eclat.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User toEntity(UserDto dto);
    UserDto toDto(User entity);
}
