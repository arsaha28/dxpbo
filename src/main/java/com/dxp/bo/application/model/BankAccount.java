package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String accountId;
    private String customerID;
    private String accountNumber;
    private String sortCode;
    private String bankName;
    private Date startDate;
    private Date endDate;
    private String userName;


}