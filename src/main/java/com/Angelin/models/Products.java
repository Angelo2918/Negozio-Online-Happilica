package com.Angelin.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * Represents a product entity in the system.
 * <p>
 * The class defines the structure of a Product object including its id, name, description, price, and rating.
 * This class is annotated with @Data, @Builder, @AllArgsConstructor, @NoArgsConstructor to provide necessary functionalities.
 * The entity is mapped to the "product" table in the database.
 * <p>
 * The fields in the Product class are:
 * - id: Unique identifier for the product.
 * - name: Name of the product.
 * - description: Description of the product.
 * - price: Price of the product.
 * - rating: Rating of the product.
 */

@Table(name = "products")
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;


}