package com.example.demo.services;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository; //loose coupling //new keyword means tight coupling

    public void addUser(UserModel user){
        if(user!=null){
        userRepository.save(user);
        }
        else{
            throw new NullPointerException();
        }
    }

    public UserModel userLogin(String email, String password) {
        UserModel user;
        if(!email.isEmpty() && !password.isEmpty()){
            user=userRepository.findByEmailAndPassword(email, password);
            if(user!=null){
                return user;
            }
            else
                throw new NullPointerException("User not found");
        }
        else{
            throw new NullPointerException("User not found");
        }

    }
}
