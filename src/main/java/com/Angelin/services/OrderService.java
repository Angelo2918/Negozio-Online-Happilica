package com.Angelin.services;

import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;

import java.util.List;

/**
 * An interface representing the OrderService in the system.
 * Provides methods to manage orders including adding, viewing, updating, and removing orders.
 */
public interface OrderService {
    Order placeOrder(Long userId, List<OrderItem> items);

    List<Order> getOrdersWithPagination(Long userId, int page, int size);

    Order cancelOrder(Long orderId);
}