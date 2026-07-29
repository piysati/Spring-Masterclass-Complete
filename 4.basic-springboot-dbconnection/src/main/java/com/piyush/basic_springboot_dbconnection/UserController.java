package com.piyush.basic_springboot_dbconnection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public void addUser(){
        userRepository.save(new UserEntity(1L, "Piyush"));
    }

}
