package com.dxp.bo.application.service;

import com.dxp.bo.application.model.Customer;
import com.dxp.bo.application.repository.CustomerRepository;
import io.micrometer.observation.ObservationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    public List<Customer> findByCustomerId(Long customerId) {
        return customerRepository.findByCustomerId(customerId);
    }
    
    public List<Customer> findByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
    
    public List<Customer> findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }


}
