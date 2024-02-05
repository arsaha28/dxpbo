package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@Data
@ToString
@AllArgsConstructor
public class LoanApplication {
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
