package com.Angelin.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


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
}

