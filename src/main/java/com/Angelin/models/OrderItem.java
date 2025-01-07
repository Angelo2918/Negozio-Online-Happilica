package com.Angelin.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Represents an item in an order that includes the food, quantity, and order it belongs to.
 */
@Entity
    @Table(name = "order_item")
    @Data
    public class OrderItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "food_id", nullable = false)
        private Food food;

        @Column(nullable = false)
        private Integer quantity;

        @ManyToOne
        @JoinColumn(name = "order_id", nullable = false)
        @JsonBackReference
        private Order order;

        public OrderItem() {
        }

        public OrderItem(Order order, Food food, Integer quantity) {
            this.order = order;
            this.quantity = quantity;
            this.food = food;
        }

        public BigDecimal getSubtotal() {
            return food.getPrice().multiply(BigDecimal.valueOf(quantity));
        }

        public void setQuantity(Integer quantity) {
            if (quantity <= 0)
                throw new IllegalArgumentException("Quantity must be positive!");

            this.quantity = quantity;
        }

        public void updateFoodStock() {
            this.food.setStockQuantity(this.food.getStockQuantity() - this.quantity);
        }

    }