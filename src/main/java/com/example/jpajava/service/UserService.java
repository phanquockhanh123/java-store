package com.example.jpajava.service;

import com.example.jpajava.entity.User;

public interface UserService {
    User findByUserName(String username);
}
