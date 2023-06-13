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
public class RateOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerId;


    private Integer OrderId;


    @Column(columnDefinition = "varchar(5)  not null ")
    private String rating;

    @OneToOne
    @JsonIgnore
    @MapsId
    private Order order;
}
