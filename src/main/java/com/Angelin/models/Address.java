package com.Angelin.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an address entity that stores information about a physical location.
 * Includes details such as city, street, country, and number of the street.
 */
@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String street;
    private String country;
    private Integer numberOfStreet;


//    @OneToOne(mappedBy = "address")
//    @JsonBackReference
//    private User user;

}