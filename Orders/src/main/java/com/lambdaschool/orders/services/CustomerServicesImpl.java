package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    CustomerRepo customerrepo;

    @Override
    public Customer save(Customer customer){
        return customerrepo.save(customer);
    }

}
