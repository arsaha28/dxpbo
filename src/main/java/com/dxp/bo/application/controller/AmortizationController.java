package com.dxp.bo.application.controller;


import com.dxp.bo.application.model.AmortizationScheduleEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/amortization")
public class AmortizationController {

    private static  final int MONTH = 12;
    private static  final int PERCENT = 100;


    @GetMapping
    public List<AmortizationScheduleEntry> generate(double loanAmount, double annualInterestRate, int termMonths){
        List<AmortizationScheduleEntry> schedule = generateAmortizationSchedule(loanAmount,annualInterestRate,termMonths);
        return  schedule;

    }

    public static List<AmortizationScheduleEntry> generateAmortizationSchedule(double loanAmount, double annualInterestRate, int termMonths) {
        List<AmortizationScheduleEntry> schedule = new ArrayList<>();
        double monthlyInterestRate = annualInterestRate/MONTH/PERCENT;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -termMonths));

        double remainingBalance = loanAmount;
        for (int month = 1; month <= termMonths; month++) {
            double interestPayment = remainingBalance * monthlyInterestRate;
            double principalPayment = monthlyPayment - interestPayment;
            remainingBalance = remainingBalance-principalPayment;
            AmortizationScheduleEntry entry = new AmortizationScheduleEntry(
                    month,
                    monthlyPayment,
                    interestPayment,
                    principalPayment,
                    remainingBalance
            );

            schedule.add(entry);
        }

        return schedule;
    }

}
