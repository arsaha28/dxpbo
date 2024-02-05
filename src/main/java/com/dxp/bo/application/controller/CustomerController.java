package com.dxp.bo.application.controller;

import com.dxp.bo.application.model.Customer;
import com.dxp.bo.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
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
        //return customerService.save(customer).map(ResponseEntity::created).orElse(ResponseEntity.badRequest().build());
        return null;
    }
    
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        //return customerService.updateById(id, customer).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        return null;
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        //return customerService.deleteById(id).map(ResponseEntity::noContent).orElse(ResponseEntity.notFound().build());
        return null;
    }
}
