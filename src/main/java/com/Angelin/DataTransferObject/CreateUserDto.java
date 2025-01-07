package com.Angelin.DataTransferObject;

import com.Angelin.models.Order;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a Data Transfer Object (DTO) for creating a user.
 *
 * This class includes fields for the user's name, registration date, email, username, activity status,
 * address information, and a list of orders associated with the user.
 *
 * Use the getters and setters to access or update the fields of the CreateUserDto object.
 */
@Data
@ToString
public class CreateUserDto implements Serializable {
    private String name;
    private LocalDate registrationDate;
    private String email;
    private String username;
    private boolean active;
    private AddressDto address;
    private List<Order> orders;
}