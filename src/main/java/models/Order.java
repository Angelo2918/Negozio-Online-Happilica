package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * This class represents an order entity that includes information such as order id, user id, and a list of order items.
 * It is annotated as an entity in JPA to enable mapping to a corresponding database table called "orders".
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @OneToMany
    private List<OrderList> orderList;

}
