package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Table(name = "user_table")
@Entity
@Data
@DynamicUpdate
@NoArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
    @SequenceGenerator(name = "user_id_generator", initialValue = 1900, allocationSize = 25)
    int user_id;

    @NonNull
    String name;

    @NonNull
    int phone_no;

    @NonNull
    String password;

    @NonNull
    int age;

    @NonNull
    String email;
}
