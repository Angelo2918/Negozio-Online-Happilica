package com.Angelin.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents an order entity in the system.
 * The MyOrder class is annotated with @Entity, @Table, @Data, @NoArgsConstructor, and @AllArgsConstructor annotations.
 * This entity class is used to store order information such as order ID, date and time of order, order status, customer details, list of products, and shipping address.
 */
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer orderId;

    LocalDate localDateTime;
    String orderStatus;
    @OneToOne(cascade = CascadeType.ALL)
    Customer customer;
    @OneToMany(cascade = CascadeType.ALL)
    List<Products> productlist;
    @OneToOne(cascade = CascadeType.ALL)
    Address address;
}
