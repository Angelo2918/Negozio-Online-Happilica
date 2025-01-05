package com.Angelin.controller;

import com.Angelin.models.MyOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Angelin.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderservice;

    @PostMapping("/add-from-cart/{customerId}")
    public ResponseEntity<MyOrder> addOrderFromCart(@PathVariable Integer customerId) {
        MyOrder myOrder = orderservice.addorderFromCart(customerId);
        return new ResponseEntity<MyOrder>(myOrder, HttpStatus.ACCEPTED);
    }

    @GetMapping("/find-all-order")
    public ResponseEntity<List<MyOrder>> viewAllOrder() {
        List<MyOrder> allOrder = orderservice.viewOrder();
        return new ResponseEntity<List<MyOrder>>(allOrder, HttpStatus.ACCEPTED);
    }

    @GetMapping("/find-by-customer-id/{customerId}")
    public ResponseEntity<MyOrder> viewOrderByCustomerID(@PathVariable Integer customerId) {
        MyOrder findOrder = orderservice.viewOrderByCustomerId(customerId);
        return new ResponseEntity<MyOrder>(findOrder, HttpStatus.ACCEPTED);
    }

    @GetMapping("/find-order-by-user-name/{FirstName}/{LastName}/{mobileNo}")
    public ResponseEntity<List<MyOrder>> viewByUserName(@PathVariable("FirstName") String FirstName, @PathVariable("LastName") String LastName, @PathVariable("mobileNo") String mobileNo) {
        List<MyOrder> getOrderByName = orderservice.findOrderByUserName(FirstName, LastName, mobileNo);
        return new ResponseEntity<List<MyOrder>>(getOrderByName, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("remove-order/{customerId}")
    public ResponseEntity<String> removeOrderByCustomerID(@PathVariable Integer customerId) {
        String findOrder = orderservice.removeOrder(customerId);

        return new ResponseEntity<String>(findOrder, HttpStatus.ACCEPTED);
    }
}

