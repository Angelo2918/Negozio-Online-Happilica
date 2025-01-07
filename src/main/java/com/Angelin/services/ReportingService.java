package com.Angelin.services;

import com.Angelin.models.Order;
import com.Angelin.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReportingService {
    @Autowired
    private OrderRepository orderRepository;

    @Scheduled(cron = "0 0 9 ? * MON")
    public void generateWeeklyOrderReport() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(7);

    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}