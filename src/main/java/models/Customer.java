package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer entity in the system.
 * The Customer class is annotated with @Data, @NoArgsConstructor, @AllArgsConstructor, @Entity, and @ToString annotations to provide necessary functionalities and mark it as a J
 * PA entity.
 * The entity is used to store information about a customer, such as their details.
 * <p>
 * This class does not contain any explicit fields, but it inherits getter, setter, constructors, toString, and other methods from the Lombok annotations and Entity annotation.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    @NotNull(message = "Please input a valid name!")
    private String firstname;
    @NotNull(message = "Please input a valid name!")
    private String lastname;
    @Email(message = "Please input a valid email address!")
    private String email;
    @Pattern(regexp = "[7896]{1}[0-9]{9}",message = "Input a valid mobile number")
    @NotNull(message = "Please enter your mobile phone!")
    private String mobilenumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresslist = new ArrayList<>();


}
