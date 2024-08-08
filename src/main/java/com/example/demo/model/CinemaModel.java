package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Data
@DynamicUpdate
@Table(name="cinema_table")
@NoArgsConstructor
@Entity
public class CinemaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cinema_id_generator")
    @SequenceGenerator(name = "cinema_id_generator", initialValue = 2000, allocationSize = 5)
    int cinemaId;

    @NonNull
    String cinemaName;

    @NonNull
    String address;

    @NonNull
    int noOfSeats;

    @NonNull
    int totalSeats;

    @NonNull
    int price_1;

    @NonNull
    int price_2;

    @NonNull
    int price_3;

    @NonNull
    int price_4;
}
