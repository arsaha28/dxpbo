package com.dxp.bo.application.service;

import com.dxp.bo.application.model.Customer;
import com.dxp.bo.application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    public Customer write(Customer customer){
       return customerRepository.save(customer);
    }





}
