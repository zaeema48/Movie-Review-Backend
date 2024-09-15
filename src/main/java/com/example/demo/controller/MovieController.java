package com.example.demo.controller;

import com.example.demo.model.MovieModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/movie")
public class MovieController {

    @PostMapping("/movie_review")
    public void movieReview(@RequestParam String review, @RequestParam float rating){

    }
}
