package com.Angelin.models;


import jakarta.persistence.*;

/**
 * This class represents an order list entity that contains information about a product in an order, including
 * the unique identifier of the order list item, the id of the product being ordered, and the quantity of that product.
 * It is annotated as an entity in JPA to facilitate mapping to a database table named "order_list".
 */

@Table(name = "order")
@Entity
public class OrderList {

    @Id
    @GeneratedValue
    private Long id;
    private Long productId;
    private int count;


}
