package com.Angelin.controller;


import com.Angelin.DataTransferObject.RequestOrderDto;
import com.Angelin.models.Order;
import com.Angelin.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class that handles HTTP requests related to orders.
 * Contains mappings for placing orders, retrieving orders with pagination, and canceling orders.
 */
@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody RequestOrderDto orderDto) {
        System.out.println(" Order");
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

    public OrderService getService() {
        return service;
    }

    public void setService(OrderService service) {
        this.service = service;
    }
}