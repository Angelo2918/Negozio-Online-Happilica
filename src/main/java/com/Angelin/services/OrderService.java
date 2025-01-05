package com.Angelin.services;

import com.Angelin.impl.OrderServiceImpl;
import com.Angelin.models.MyOrder;
import com.Angelin.models.OrderList;

import java.util.List;
/**
 * An interface representing the OrderService in the system.
 * Provides methods to manage orders including adding, viewing, updating, and removing orders.
 */
public interface OrderService {

    public List<MyOrder> viewOrder();

    public MyOrder viewOrderByCustomerId(Integer customerId);

    public List<MyOrder> findOrderByUserName(String FirstName, String LastName, String mobileNo);

    public String removeOrder(Integer customerId);

    public MyOrder addOrderFromCart(Integer customerId);
}
