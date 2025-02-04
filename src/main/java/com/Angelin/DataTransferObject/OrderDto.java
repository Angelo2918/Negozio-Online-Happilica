package com.Angelin.DataTransferObject;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Represents a Data Transfer Object (DTO) for an order.
 * <p>
 * This class is used for transferring order data between different layers of the application.
 */
@Data
@ToString
public class OrderDto implements Serializable {
    private String product;
    private Double price;
    private LocalDate orderDate;

    public String getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
