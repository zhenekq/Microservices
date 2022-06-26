package com.voznyit.customer.service.impl;

import com.voznyit.customer.Customer;
import com.voznyit.customer.CustomerRegistrationRequest;
import com.voznyit.customer.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public record CustomerServiceImpl() implements CustomerService {

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

    }

}