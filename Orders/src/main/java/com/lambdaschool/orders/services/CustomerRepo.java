package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
