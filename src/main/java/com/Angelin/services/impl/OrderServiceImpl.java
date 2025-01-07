package com.Angelin.services.impl;

import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;
import com.Angelin.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order placeOrder(Long userId, List<OrderItem> items) {
        return null;
    }

    @Override
    public List<Order> getOrdersWithPagination(Long userId, int page, int size) {
        return List.of();
    }

    @Override
    public Order cancelOrder(Long orderId) {
        return null;
    }
}
