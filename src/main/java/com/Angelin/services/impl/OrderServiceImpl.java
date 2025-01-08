package com.Angelin.services.impl;

import com.Angelin.enums.OrderStatus;
import com.Angelin.models.Food;
import com.Angelin.models.Order;
import com.Angelin.models.OrderItem;
import com.Angelin.models.User;
import com.Angelin.repositories.FoodRepository;
import com.Angelin.repositories.OrderRepository;
import com.Angelin.repositories.UserJpaRepository;
import com.Angelin.services.OrderService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserJpaRepository userRepository;
    @Autowired
    private FoodRepository foodRepository;

    /**
     * Places an order for a specific user
     */
    public Order placeOrder(Long userId, List<OrderItem> items) {
        if (items == null || items.isEmpty())
            throw new IllegalArgumentException("Order must contain at least one item!");

        items.forEach(i -> {
            System.out.println(i.getFood());
        });
        Optional<User> userOpt = userRepository.findById(userId);
        Order order = new Order();
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            order.setUser(user);
            order.setStatus(OrderStatus.PENDING);
            order.setOrderDate(LocalDate.now());

            List<OrderItem> orderItems = items.stream()
                    .map(item -> {
                        OrderItem orderItem = new OrderItem();
                        orderItem.setOrder(order);
                        orderItem.setQuantity(item.getQuantity());

                        if (item.getFood() == null) {
                            Food food = foodRepository.findById(item.getFood().getId())
                                    .orElseThrow(() -> new EntityNotFoundException("Food not found!"));
                            orderItem.setFood(food);
                        } else {
                            System.out.println("item.getInstrument() = " + item.getFood());
                            orderItem.setFood(item.getFood());
                        }

                        return orderItem;
                    }).toList();

            order.setItems(orderItems);
            order.calculateTotalAmount();
            items.forEach(OrderItem::updateFoodStock);
        } else {
            throw new EntityNotFoundException("User was not found!");
        }

        return orderRepository.save(order);
    }

    public List<Order> getOrdersWithPagination(Long userId, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        Page<Order> orderPage = orderRepository.findByUserId(userId, pageRequest);
        return orderPage.getContent();
    }

    @Transactional
    public Order cancelOrder(Long orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Order was not found!"));

        order.getItems().forEach(item -> {
            Food food = item.getFood();
            food.setStockQuantity(food.getStockQuantity() + item.getQuantity());
        });

        order.setStatus(OrderStatus.CANCELLED);
        return orderRepository.save(order);
    }
}