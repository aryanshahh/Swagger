package com.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.demo.model.User;
import com.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/fetch/{userid}")
    @ApiOperation("Returns Uer based in user id .")
    public User getUserById(@PathVariable  String  userid){
        return userService.getUserById(userid);
    }

    @GetMapping("/fetchAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{userid}")
    public String deleteUserById(@PathVariable  String  userid){
        return userService.deleteUserById(userid);
    }

    @PostMapping("/create")
    public User saveUser(@RequestBody  User  user){
        return userService.saveUser(user);
    }

}
