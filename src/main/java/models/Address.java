package models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * Represents an address entity with details such as street number, city, country, and pincode.
 * This class is annotated with @Entity to mark it as a JPA entity.
 * It uses Lombok annotations such as @Data, @NoArgsConstructor, @AllArgsConstructor, and @ToString for code generation.
 */
@Entity
@Table(name = "adresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Please fill street number!")
    private String numberOfStreet;
    @NotNull(message = "please fill City name")
    private String city;
    @NotNull(message = "please fill country name")
    private String country;
    @Pattern(regexp = "([1-9]{1}[0-9]{5}|[1-9]{1}[0-9]{3}\\\\s[0-9]{3})", message = "please input a valid pincode")
    private String pincode;

}
