package com.dxp.bo.application.controller;

import com.dxp.bo.application.model.Customer;
import com.dxp.bo.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        //return customerService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        return null;
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer customerCrated = customerService.write(customer);
        return new ResponseEntity<>(customerCrated,HttpStatus.OK);
    }
}
