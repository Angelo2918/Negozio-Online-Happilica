package com.Angelin.models;


import com.Angelin.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents an order placed by a user consisting of order items.
 * <p>
 * An order includes the ID, items in the order, order date, status, total amount, and the user who placed the order.
 * It provides methods to calculate the total amount of the order and update its status based on the order items.
 */
@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OrderItem> items;
    private LocalDate orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private BigDecimal totalAmount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

    public Order(List<OrderItem> items, OrderStatus status, LocalDate orderDate, User user) {
        this.items = items;
        this.status = status;
        this.orderDate = orderDate;
        this.user = user;
    }

    public Order() {

    }

    public void calculateTotalAmount() {
        this.totalAmount = items.stream().map(OrderItem::getSubtotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void updateStatus() {
        if (items.isEmpty()) {
            this.status = OrderStatus.CANCELLED;
        } else if (status == OrderStatus.PENDING) {
            this.status = OrderStatus.PROCESSING;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
