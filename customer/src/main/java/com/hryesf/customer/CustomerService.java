package com.hryesf.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public boolean registerCustomer(CustomerRegistrationDTO request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email is taken or not
        // todo: check if email is valid or not
        customerRepository.save(customer);
        return true;
    }
}
