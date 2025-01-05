package com.Angelin.impl;

import com.Angelin.models.MyOrder;
import com.Angelin.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<MyOrder> viewOrder() {
        return List.of();
    }

    @Override
    public MyOrder viewOrderByCustomerId(Integer customerId) {
        return null;
    }

    @Override
    public List<MyOrder> findOrderByUserName(String FirstName, String LastName, String mobileNo) {
        return List.of();
    }

    @Override
    public String removeOrder(Integer customerId) {
        return "";
    }

    @Override
    public MyOrder addOrderFromCart(Integer customerId) {
        return null;
    }
}
