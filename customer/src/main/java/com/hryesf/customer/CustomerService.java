package com.hryesf.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public boolean registerCustomer(CustomerRegistrationDTO request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email is taken or not
        // todo: check if email is valid or not
        // todo: store customer in db
        return true;
    }
}
