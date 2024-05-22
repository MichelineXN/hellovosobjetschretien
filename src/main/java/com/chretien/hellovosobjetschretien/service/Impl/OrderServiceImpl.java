package com.chretien.hellovosobjetschretien.service.Impl;


import com.chretien.hellovosobjetschretien.domain.Order;
import com.chretien.hellovosobjetschretien.repositories.OrderRepository;
import com.chretien.hellovosobjetschretien.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Order add(Order order) {
        return null;
    }
}
