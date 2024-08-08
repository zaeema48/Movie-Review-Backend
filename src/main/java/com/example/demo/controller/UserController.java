package com.example.demo.controller;

import com.example.demo.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/user")
public class UserController {
    //http local host 8080/cinema/xyz...

    @PostMapping("/addUser")
    public ResponseEntity<UserModel>userLogin(){

    }
}
