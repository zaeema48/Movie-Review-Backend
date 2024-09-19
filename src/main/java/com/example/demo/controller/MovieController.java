package com.example.demo.controller;

import com.example.demo.model.MovieModel;
import com.example.demo.model.ReviewModel;
import com.example.demo.model.UserModel;
import com.example.demo.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinema/movie")
public class MovieController {
    MovieService movieService;
    @PostMapping("/movie_review")
    public ResponseEntity<String> movieReview(@RequestBody ReviewModel reviewModel){
        movieService.
    }

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody MovieModel movie){
    movieService.addMovie(movie);
    }

    @GetMapping("/searchMovie")
    public ResponseEntity<List<MovieModel>>searchMovie(String movieName){
        return new  ResponseEntity<>(movieService.searchMovie(movieName), HttpStatus.OK);
    }

    @GetMapping("/allMovies")
    public ResponseEntity<List<MovieModel>>findAllMovies(){
        return new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.OK);
    }
}
