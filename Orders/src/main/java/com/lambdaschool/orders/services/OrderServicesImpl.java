package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices {

    @Autowired
    OrderRepo orderrepo;

    @Override
    public Order save(Order order){
        return orderrepo.save(order);
    }

}
