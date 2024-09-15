package com.example.demo.controller;
import com.example.demo.model.BookingModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/booking")
public class BookingController {

    @PostMapping("/movie_booking")
    public ResponseEntity<BookingModel> ticketBooking(@RequestBody BookingModel bookingModel){

    }
}
