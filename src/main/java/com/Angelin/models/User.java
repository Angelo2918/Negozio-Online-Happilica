package com.Angelin.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Represents a User entity that holds information about users,
 * such as id, name, mobile number, registration date, email, username, and active status.
 */
@Entity
@Table(name = "/api/users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String mobile;
    private LocalDate registrationDate;
    private String email;
    private String username;
    private boolean active;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "wishlist",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "instrument_id")
    )
    private Set<Foods> wishlist = new HashSet<>();

}

