package com.maheen.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maheen.orderservice.entity.Order;
import com.maheen.orderservice.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public Order saveProduct(@RequestBody Order productId) {
        return orderService.saveOrder(productId);
    }

    @RequestMapping(value = "orders/{id}/", method = RequestMethod.GET)
    public Order findProductById(@PathVariable("id") String productId) {
        return orderService.findOrderById(productId);
    }
}