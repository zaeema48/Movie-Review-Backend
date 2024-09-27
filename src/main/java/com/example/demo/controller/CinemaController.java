package com.example.demo.controller;

import com.example.demo.model.CinemaModel;
import com.example.demo.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema/cinema_details")
public class CinemaController {
    @Autowired
    CinemaService cinemaService;

    @PostMapping("/add_cinema_hall")
    public void addCinema(@RequestBody CinemaModel cinemaModel){
        cinemaService.addCinemaHall(cinemaModel);
    }

    @GetMapping("/view_cinema_details")
    public ResponseEntity<CinemaModel> cinemaDetails(@RequestParam int cinemaId){
        CinemaModel cinema;
         cinema=cinemaService.viewCinemaDetails(cinemaId);
         return new ResponseEntity<>(cinema, HttpStatus.FOUND);
    }

    @GetMapping("/view_no_of_seats")
    public int viewSeats(@RequestParam int cinemaId){
       int no=cinemaService.viewNoOfSeatsAvailable(cinemaId);
       return no;
    }

    @GetMapping("/view_total_seats")
    public ResponseEntity<Integer>cinemaTotalSeats(@RequestParam int cinemaId){
        int no=cinemaService.viewTotalNoOfSeats(cinemaId);
        return new ResponseEntity<>(no, HttpStatus.OK);
    }


}
