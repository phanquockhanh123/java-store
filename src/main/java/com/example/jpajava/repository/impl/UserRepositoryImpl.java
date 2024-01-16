package com.example.jpajava.repository.impl;

import com.example.jpajava.entity.User;
import com.example.jpajava.repository.UserRepository;
import com.example.jpajava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
