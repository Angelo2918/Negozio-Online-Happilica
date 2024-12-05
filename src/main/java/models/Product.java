package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a product entity in the system.
 *
 * The class defines the structure of a Product object including its id, name, description, price, and rating.
 * This class is annotated with @Data, @Builder, @AllArgsConstructor, @NoArgsConstructor to provide necessary functionalities.
 * The entity is mapped to the "product" table in the database.
 *
 * The fields in the Product class are:
 * - id: Unique identifier for the product.
 * - name: Name of the product.
 * - description: Description of the product.
 * - price: Price of the product.
 * - rating: Rating of the product.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private double rating;

}