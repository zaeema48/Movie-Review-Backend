package com.example.demo.dao;
import com.example.demo.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Integer> {

    //here we define custom methods

    @Query(value="SELECT * FROM movie_table WHERE movie_name LIKE %: movie%", nativeQuery = true) //LIKE % is for searching
    public List<MovieModel>searchMovieByName(String movie);

    @Query(value="SELECT * FROM movie_table WHERE movie_id =: movieId", nativeQuery = true)
    public MovieModel findByMovieId(int movieId);

}
