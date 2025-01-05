package com.Angelin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * This class represents an order list entity that contains information about a product in an order, including
 * the unique identifier of the order list item, the id of the product being ordered, and the quantity of that product.
 * It is annotated as an entity in JPA to facilitate mapping to a database table named "order_list".
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_list")
@Entity
public class OrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private int count;

}
