package com.Angelin.impl;

import com.Angelin.models.MyOrder;
import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;
import com.Angelin.repositories.FoodsRepository;
import com.Angelin.repositories.UserJpaRepository;
import com.Angelin.repositories.UserRepository;
import com.Angelin.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserJpaRepository jpaRepository;
    @Autowired
    private FoodsRepository foodsRepository;

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
