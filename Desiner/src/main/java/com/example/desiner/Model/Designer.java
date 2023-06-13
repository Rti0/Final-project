package com.example.desiner.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(columnDefinition = "varchar(20) not null ")
    private String name;


    @Email
    @Column(columnDefinition = "varchar(50) not null ")
    private String email;

    @Column(columnDefinition = "varchar(20) not null ")
    private String location;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "designer")
    private Set<Order>orders;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "designer")
    private Set<Services>servicesSet;


    @OneToOne(cascade = CascadeType.ALL,mappedBy ="designer" )
    @PrimaryKeyJoinColumn
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "designer")
    private Set<DesignerBusiness>designerBusinesses;




}
