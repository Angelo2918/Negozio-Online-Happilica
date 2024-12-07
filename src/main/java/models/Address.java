package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Represents an address entity with details such as street number, city, country, and pincode.
 * This class is annotated with @Entity to mark it as a JPA entity.
 * It uses Lombok annotations such as @Data, @NoArgsConstructor, @AllArgsConstructor, and @ToString for code generation.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    @NotNull(message = "Please fill street number!")
    private String streetNo;
    @NotNull(message = "Please fill City name!")
    private String city;
    @NotNull(message = "Please fill country name!")
    private String country;
    @NotNull(message = "Please input a valid postal code!")
    private String pincode;

}
