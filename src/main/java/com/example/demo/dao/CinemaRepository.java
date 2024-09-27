package com.example.demo.dao;
import com.example.demo.model.CinemaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<CinemaModel, Integer> {
    @Query(value="SELECT * FROM cinema_table WHERE cinema_id =:cinemaId",nativeQuery = true)
    public CinemaModel findByCinemaId(@Param("cinemaId") int cinemaId);

}
