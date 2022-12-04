package com.lolteammaker.backend.controller;

import com.lolteammaker.backend.model.dto.User;
import com.lolteammaker.backend.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> registUser(User user){
        userService.registUser(user);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> selectUser(@PathVariable String id){
        return new ResponseEntity<User>(userService.selectUser(id), HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> removeUser(@PathVariable String id){
        userService.removeUser(id);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

}