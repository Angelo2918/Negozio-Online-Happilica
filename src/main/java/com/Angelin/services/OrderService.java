package com.Angelin.services;

import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;
public interface OrderService {
    Order placeOrder(Long userId, List<OrderItem> items);

    List<Order> getOrdersWithPagination(Long userId, int page, int size);

    Order cancelOrder(Long orderId);

}