package com.example.demo.services;

import com.example.demo.dao.MovieRepository;
import com.example.demo.dao.ReviewRepository;
import com.example.demo.model.MovieModel;
import com.example.demo.model.ReviewModel;
import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;                 //loose coupling

    public void addMovie(MovieModel movie){
        if(movie!=null){
            movieRepository.save(movie);
        }
        else{
            throw new NullPointerException();
        }
    }

    public List<MovieModel> searchMovie(String movieName){
        List<MovieModel> movieList;
        if(movieName!=null){
           movieList= movieRepository.searchMovieByName(movieName);
        }
        else{
            throw new NullPointerException();
        }

        return movieList;
    }

    public List<MovieModel> findAllMovies(){
        List<MovieModel> moviesList;
        moviesList=movieRepository.findAll();

        if(moviesList.isEmpty()){
            throw new NullPointerException();
        }

        return moviesList;
    }

    @Autowired
    ReviewRepository reviewRepository;
    public void addMovieReview(ReviewModel reviewModel){
        if(reviewModel!=null) {
          reviewRepository.save(reviewModel);
      }
      else{
          throw new NullPointerException();
      }
    }

    public List<ReviewModel> movieReviewList(int movieId){
        List<ReviewModel> reviews=reviewRepository.findByMovieId(movieId);
        if(reviews.isEmpty()){
            throw new NullPointerException();
        }
        else {
            return reviews;
        }
    }

    public void deleteMovie(int movieId){
        if(movieId!=0){
            movieRepository.deleteById(movieId);
        }
        else{
            throw new NullPointerException();
        }
    }

    public List<ReviewModel> usersAllReviews(int userId){
        List<ReviewModel> listOfAllReviewsOfuser= reviewRepository.findReviewsByUserId(userId);
        if(!listOfAllReviewsOfuser.isEmpty()){
            return listOfAllReviewsOfuser;
        }
        else{
            throw new NullPointerException();
        }
    }

}
