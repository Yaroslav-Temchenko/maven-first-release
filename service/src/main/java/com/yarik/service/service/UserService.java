package com.yarik.service.service;

import com.yarik.database.dao.UserDao;
import com.yarik.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id).map(it -> new UserDto());
    }
}
