package com.maheen.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maheen.orderservice.entity.Order;
import com.maheen.orderservice.repository.OrderRepository;

@Service

public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    public Order saveOrder(Order order) {
        return OrderRepository.save(order);
    }

    public Order findOrderById(String orderId) {
        return OrderRepository.findOrderById(orderId);
    }

}
