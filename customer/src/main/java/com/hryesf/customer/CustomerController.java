package com.hryesf.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("api/customers")
// why controller is a record instead of class?
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public ResponseEntity<Boolean> registerCustomer(@RequestBody CustomerRegistrationDTO customerRegistrationDTO) {
        log.info("Registering customer {}", customerRegistrationDTO);
        boolean response = customerService.registerCustomer(customerRegistrationDTO);
        return ResponseEntity.ok(response);
    }
}
