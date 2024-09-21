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
    public ResponseEntity<String> addMovieReview(@RequestBody ReviewModel reviewModel){
        movieService.addMovieReview(reviewModel);
        return new ResponseEntity<>("Review added", HttpStatus.CREATED);
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

    @GetMapping("/getAllReviews")
    public ResponseEntity<List<ReviewModel>> getMovieReviews(@RequestParam int movieId){
        return new ResponseEntity<>(movieService.movieReviewList(movieId), HttpStatus.OK);
    }

    @DeleteMapping("/deleteMovie")
    public void deleteMovie(@RequestParam int movieId){
        movieService.deleteMovie(movieId);
    }

    @GetMapping("/fetchAllReviewsOfUser")
    public ResponseEntity<List<ReviewModel>>fetchAllReviewsOfUser(int userId){
        List<ReviewModel> reviewList;
        reviewList=movieService.usersAllReviews(userId);
        if(reviewList.isEmpty()){
            return new ResponseEntity<>(reviewList, HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(reviewList, HttpStatus.OK);
        }
    }


}
