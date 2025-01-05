package com.Angelin.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents an order made by a customer in the system.
 * <p>
 * The MyOrder class is annotated with @Data, @AllArgsConstructor, @NoArgsConstructor, @Entity, and @ToString annotations, providing necessary functionalities and marking it as a
 * JPA entity.
 * The entity stores information about an order, including order ID, local date and time of the order, order status, customer details, product list, and delivery address.
 * <p>
 * The fields in the MyOrder class are:
 * - orderId: Unique identifier for the order.
 * - localDateTime: Date and time when the order was placed.
 * - orderStatus: Current status of the order.
 * - customer: Customer entity associated with the order.
 * - productlist: List of products included in the order.
 * - address: Address entity for the delivery address of the order.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "orders")
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
