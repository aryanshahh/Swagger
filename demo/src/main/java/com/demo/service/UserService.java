package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {
    User getUserById(String userid);

    List<User> getAllUsers();

    String deleteUserById(String userid);

    User saveUser(User user);
}
