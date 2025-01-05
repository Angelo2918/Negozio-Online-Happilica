package com.Angelin.models;


import com.Angelin.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OrderItem> items;
    private LocalDate orderDate;
    @Enumerated
    private OrderStatus status;
    private BigDecimal totalAmount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user-id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

    public Order(List<OrderItem> items, OrderStatus status, LocalDate orderDate, User user) {
        this.items = items;
        this.status = status;
        this.orderDate = orderDate;
        this.user = user;
    }

    public void updateStatus() {
        if (items.isEmpty()) {
            this.status = OrderStatus.CANCELLED;
        } else if (status == OrderStatus.PENDING) {
            this.status = OrderStatus.PROCESSING;
        }
    }

}