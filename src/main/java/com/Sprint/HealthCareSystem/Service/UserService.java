package com.Sprint.HealthCareSystem.Service;

import java.util.List;

import com.Sprint.HealthCareSystem.Entity.User;
import com.Sprint.HealthCareSystem.Exceptions.UserCreationError;
import com.Sprint.HealthCareSystem.Exceptions.UserNotFoundException;


public interface IUserService {

    User validateUser(String username, String password) throws Exception;
    public User addUser(User user) throws UserCreationError;
    public User removeUser(User user) throws UserNotFoundException;
    User updateUser(User user) throws UserNotFoundException ;
    List<User> getAll();
}
