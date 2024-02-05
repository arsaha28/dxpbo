package com.dxp.bo.application.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@Data
@ToString
@AllArgsConstructor
public class Loan {
    private int loanID;
    private int applicationID;
    private BigDecimal loanAmount;
    private BigDecimal interestRate;
    private int termMonths;
    private Date disbursementDate;
    private Date repaymentStartDate;
    private Date repaymentEndDate;
    private BigDecimal monthlyInstallmentAmount;
    private Date startDate;
    private Date endDate;

}
