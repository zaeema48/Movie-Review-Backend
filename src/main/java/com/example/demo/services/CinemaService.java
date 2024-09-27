package com.example.demo.services;

import com.example.demo.dao.CinemaRepository;
import com.example.demo.model.CinemaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CinemaService {
    @Autowired
    CinemaRepository cinemaRepository;

    public void addCinemaHall(CinemaModel cinemaModel){
       if(cinemaModel!=null)
        cinemaRepository.save(cinemaModel);

       else
           throw new NullPointerException("No cinema detail is entered");
    }

    public CinemaModel viewCinemaDetails(int cinemaId){
        CinemaModel cinemaModel;
        if(cinemaId!=0){
            cinemaModel = cinemaRepository.findByCinemaId(cinemaId);
            return cinemaModel;
        }
        else{
            throw new NullPointerException("Couldn't find cinema");
        }
    }

    public int viewNoOfSeatsAvailable(int cinemaId){
        if(cinemaId!=0){
            CinemaModel cinema=cinemaRepository.findByCinemaId(cinemaId);
            return cinema.getNoOfSeats();
        }
        else
            throw new NullPointerException("Couldn't find seats");
    }

    public int viewTotalNoOfSeats(int cinemaId){
        if(cinemaId!=0){
            CinemaModel cinema=cinemaRepository.findByCinemaId(cinemaId);
            return cinema.getTotalSeats();
        }
        else{
            throw new NullPointerException("User not found");
        }
    }
}
