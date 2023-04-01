package com.maheen.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maheen.orderservice.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    Order findOrderById(String orderId);
}
