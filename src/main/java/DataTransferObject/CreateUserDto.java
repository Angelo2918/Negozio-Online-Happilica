package DataTransferObject;

import lombok.Data;
import lombok.ToString;
import models.Order;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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
