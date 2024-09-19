package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema/user")
public class UserController {
    //http local host 8080/cinema/xyz...
    @Autowired
    UserServices userServices;

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserModel user){

        userServices.addUser(user);

    }

    @GetMapping("/login/{email}")
    public ResponseEntity<UserModel>userLogin(@PathVariable String email, @RequestParam String password){
        UserModel user=userServices.userLogin(email, password);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int user_id){
        userServices.deleteUser(user_id);
    }


}
