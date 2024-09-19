package com.example.demo.services;

import com.example.demo.dao.MovieRepository;
import com.example.demo.model.MovieModel;
import com.example.demo.model.ReviewModel;
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

    //to use getter method in place of int movieId !!!!!!!!!!!!!!
    public void movieReview(ReviewModel reviewModel, int movieId){

        MovieModel movie=movieRepository.findByMovieId(movieId);
        if(movie!=null){
            movie.setMovieReview()
        }

    }

}
