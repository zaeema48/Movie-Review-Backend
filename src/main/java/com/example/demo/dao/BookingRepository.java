package com.example.demo.dao;

import com.example.demo.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Integer> {  //Integer is the datatype of primary key of Booking model

}
