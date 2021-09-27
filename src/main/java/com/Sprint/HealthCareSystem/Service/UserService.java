package com.Sprint.HealthCareSystem.service;

import java.util.List;

import com.Sprint.HealthCareSystem.entities.User;
import com.Sprint.HealthCareSystem.exception.UserCreationError;
import com.Sprint.HealthCareSystem.exception.UserNotFoundException;


public interface IUserService {

    User validateUser(String username, String password) throws Exception;
    public User addUser(User user) throws UserCreationError;
    public User removeUser(User user) throws UserNotFoundException;
    User updateUser(User user) throws UserNotFoundException ;
    List<User> getAll();
}
