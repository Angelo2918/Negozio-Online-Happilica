package com.Angelin.services;

import com.Angelin.models.MyOrder;

import java.util.List;


/**
 * An interface representing the OrderService in the system.
 * Provides methods to manage orders including adding, viewing, updating, and removing orders.
 */
public interface OrderService {


    public MyOrder addOrder(MyOrder order, Integer customerId, Integer addressId);

    public List<MyOrder> viewOrder();

    public MyOrder viewOrderByCustomerId(Integer customerId);

    public List<MyOrder> findOrderByUserName(String FirstName, String LastName, String mobileNo);

    public MyOrder updateOrder(Integer customerId, MyOrder order);

    public String removeOrder(Integer customerId);

    public MyOrder addorderFromCart(Integer customerId);
}
