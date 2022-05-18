package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> users(){
        return userRepository.findAll();
    }

    @PostMapping(path = "users/add")
    public User addUser(@RequestBody User user){
        userRepository.save(user);
        return user;
    }
    @DeleteMapping(path = "users/delete")
    public User deleteUser(@RequestBody User user){
        userRepository.delete(user);
        return user;
    }



}





