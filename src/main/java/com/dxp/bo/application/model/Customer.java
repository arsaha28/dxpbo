package com.dxp.bo.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String customerID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String phone;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Address> addresses;
    @OneToMany(cascade=CascadeType.ALL)
    private List<BankAccount> accounts;
    private Date startDate;
    private Date endDate;


}
