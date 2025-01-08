package com.Angelin.services;

import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;

import java.util.List;

/**
 * Interface representing the service for managing orders.
 */
public interface OrderService {
    Order placeOrder(Long userId, List<OrderItem> items);

    List<Order> getOrdersWithPagination(Long userId, int page, int size);

    Order cancelOrder(Long orderId);

}