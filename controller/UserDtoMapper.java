package com.example.springytlearning.controller;

import com.example.springytlearning.dto.UserDto;
import com.example.springytlearning.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDtoMapper {

    UserDtoMapper () {
    }

    public static List<UserDto> mapToUserDtos(List<User> users) {
        return users.stream()
                .map(UserDtoMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    private static UserDto mapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .email(user.getEmail())
                .build();
    }
}
