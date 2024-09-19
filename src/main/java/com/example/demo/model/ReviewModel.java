package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="review_table")
@DynamicUpdate
@Getter
@NoArgsConstructor
public class ReviewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_id_generator")
    @SequenceGenerator(name = "review_id_generator", initialValue = 689, allocationSize = 12)
    private int reviewId;


    @NonNull
     int userId;

    @NonNull
    int movieId;

    @NonNull
     String review;

}
