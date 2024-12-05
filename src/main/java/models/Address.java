package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Represents an address entity with detailed location information such as country, city, street, and house number.
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
    private String country;
    private String city;
    private String street;
    private String numberOfStreet;

    @OneToOne(mappedBy = "address")
    @JsonBackReference
    private User user;

}
