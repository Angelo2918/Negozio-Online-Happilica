package models;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;


/**
 * Represents a User entity with basic information such as ID, name, mobile number, and password.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;

    @NotNull(message = "Please type your name!")
    private String name;

    @NotNull(message = "Please enter your mobile phone!")
    private String mobile;

    @NotNull(message = "Please type your password!")
    private String password;
}

