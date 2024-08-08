package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@Table(name = "booking_table")
@NoArgsConstructor
@DynamicUpdate
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_generator")
    @SequenceGenerator(name = "booking_generator", initialValue = 6789, allocationSize = 45)
    int bookingId;

    @NonNull
    int noOfSeats;

    @NonNull
    int phoneNo;

    @NonNull
    String cinemaName;

    @NonNull
    int totalPrice;

    @NonNull
    String date;
}
