package com.dxp.bo.application.repository;

import com.dxp.bo.application.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    @Query("SELECT c FROM Customer c WHERE c.customerID = ?1")
    List<Customer> findByCustomerId(Long customerId);
    
    @Query("SELECT c FROM Customer c WHERE c.firstName LIKE %?1%")
    List<Customer> findByFirstName(String firstName);
    
    @Query("SELECT c FROM Customer c WHERE c.lastName LIKE %?1%")
    List<Customer> findByLastName(String lastName);
    
}
