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

public class CreateUserDto implements Serializable {
    private String name;
    private LocalDate registrationDate;
    private String email;
    private String username;
    private boolean active;
   // private AddressDto address;
    private List<Order> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

//    public AddressDto getAddress() {
//        return address;
//    }
//
//    public void setAddress(AddressDto address) {
//        this.address = address;
//    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}