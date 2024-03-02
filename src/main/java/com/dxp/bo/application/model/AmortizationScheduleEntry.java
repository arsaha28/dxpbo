package com.dxp.bo.application.model;

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
public class AmortizationScheduleEntry {

    private int month;
    private double monthlyPayment;
    private double interestPayment;
    private double principalPayment;
    private double remainingBalance;
    private Date startDate;
    private Date endDate;

    public AmortizationScheduleEntry(int month, double monthlyPayment, double interestPayment, double principalPayment, double remainingBalance) {
        this.month = month;
        this.monthlyPayment = monthlyPayment;
        this.interestPayment = interestPayment;
        this.principalPayment = principalPayment;
        this.remainingBalance = remainingBalance;
    }



}
