package com.dxp.bo.application.controller;


import com.dxp.bo.application.exception.InvalidInputparameterException;
import com.dxp.bo.application.model.AmortizationScheduleEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/amortization")
public class AmortizationController {

    private static  final int MONTH = 12;
    private static  final int PERCENT = 100;


    @GetMapping
    public List<AmortizationScheduleEntry> generate(double loanAmount, double annualInterestRate, int termMonths) throws InvalidInputparameterException {
        validate(loanAmount,annualInterestRate,termMonths);
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

    private boolean validate(double loanAmount, double annualInterestRate, int termMonths) throws InvalidInputparameterException {
        Predicate<Double> amount = i -> (i < 100000 && i > 100);
        Predicate<Double> term = i -> (i < 360 && i>3);
        if(!amount.test(loanAmount)){
            throw new InvalidInputparameterException("Incorrect loan amount");
        }
        if(!term.test(annualInterestRate)){
            throw new InvalidInputparameterException("Incorrect terms");
        }
        return true;
    }

}
