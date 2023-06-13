package com.example.desiner.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(20) unique not null ")
    private String username;

    @Column(columnDefinition = "varchar(20) unique not null ")
    private String password;


    @Column(columnDefinition = "varchar(20) not null check( role='Customer' or role='Designer' )")
    private String role;


@OneToOne
    @JsonIgnore
    @MapsId
    private Customer customer;


@OneToOne
    @JsonIgnore
    @MapsId
    private Designer designer;

}
