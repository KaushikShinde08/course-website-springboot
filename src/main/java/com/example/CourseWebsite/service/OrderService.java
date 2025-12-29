package com.example.CourseWebsite.service;


import com.example.CourseWebsite.model.Order;
import com.example.CourseWebsite.repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order placeOrder(Order order) {
        return orderRepo.save(order);
    }
}