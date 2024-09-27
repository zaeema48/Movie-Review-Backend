package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Table(name="movie_table")
@Entity
@DynamicUpdate
@Data
@NoArgsConstructor
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id_generator")
    @SequenceGenerator(name = "movie_id_generator", initialValue = 456, allocationSize = 4)
    int movieId;

    @NonNull
    String movieName;

    float rating;

    String vid_url;

    List<String> img_url;
    boolean UA; //U/A if true then U or Age restricted



}
