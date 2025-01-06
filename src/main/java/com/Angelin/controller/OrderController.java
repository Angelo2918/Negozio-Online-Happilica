package com.Angelin.controller;


import com.Angelin.models.Order;
import com.Angelin.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody RequestOrderDto orderDto) {
        System.out.println("Place order!");
        Order order = service.placeOrder(orderDto.getUserId(), orderDto.getItems());
        return ResponseEntity.ok(order);
    }

    @GetMapping
    public ResponseEntity<List<Order>> ordersWithPagination(@RequestParam Long userId, @RequestParam int page, @RequestParam int size) {
        List<Order> orders = service.getOrdersWithPagination(userId, page, size);
        return ResponseEntity.ok(orders);
    }

    @PutMapping
    public ResponseEntity<Order> cancelOrder(@RequestParam Long orderId) {
        return ResponseEntity.ok(service.cancelOrder(orderId));
    }
}