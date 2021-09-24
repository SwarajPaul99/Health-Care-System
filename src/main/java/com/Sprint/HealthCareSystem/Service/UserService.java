package com.example.Healthcaresystem.service;

import com.example.Healthcaresystem.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User validateUser(String username,String password);
    public User addUser(User user);
    public User removeUser(User user);
}
