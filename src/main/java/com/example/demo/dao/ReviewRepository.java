package com.example.demo.dao;

import com.example.demo.model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewModel, Integer> {

    @Query(value="SELECT * FROM review_table WHERE movie_id =: movieId", nativeQuery = true)
    public List<ReviewModel> findByMovieId(int movieId);

    @Query(value="SELECT * FROM review_table WHERE user_id =: userId", nativeQuery = true)
    public List<ReviewModel> findReviewsByUserId(int userId);
}
