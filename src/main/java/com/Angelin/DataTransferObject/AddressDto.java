package com.Angelin.DataTransferObject;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Represents a Data Transfer Object (DTO) for an address.
 * <p>
 * This class includes fields for city, street, country, and number of the street.
 * <p>
 * Use the getters and setters to access or update the fields of the AddressDto object.
 */
@Data
@ToString
public class AddressDto implements Serializable {
    private String city;
    private String street;
    private String country;
    private Integer numberOfStreet;

}
