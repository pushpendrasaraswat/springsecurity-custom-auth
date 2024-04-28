package com.ps.springsecuritycustomauth.controller;

import com.ps.springsecuritycustomauth.dao.User;
import com.ps.springsecuritycustomauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUserController {

    @Autowired
    private  UserService userService;

    @PostMapping("/registerCustomer")
    ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser= userService.saveUser(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
