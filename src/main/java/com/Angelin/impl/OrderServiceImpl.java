package com.Angelin.impl;

import com.Angelin.models.MyOrder;
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


    public List<MyOrder> viewOrder() {
        return List.of();
    }


    public MyOrder viewOrderByCustomerId(Integer customerId) {
        return null;
    }


    public List<MyOrder> findOrderByUserName(String FirstName, String LastName, String mobileNo) {
        return List.of();
    }


    public String removeOrder(Integer customerId) {
        return "";
    }


    public MyOrder addOrderFromCart(Integer customerId) {
        return null;
    }
}
