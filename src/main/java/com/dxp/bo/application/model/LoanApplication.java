package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private int applicationID;
    private int customerID;
    private BigDecimal loanAmount;
    private Date applicationDate;
    private String status;
    private Date approvalDate;
    private String rejectionReason;
    private Date startDate;
    private Date endDate;

}
