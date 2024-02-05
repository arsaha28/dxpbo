package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.AmortizationScheduleEntry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AmortizationGenerator {

    private static  final int MONTH = 12;
    private static  final int PERCENT = 100;

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

    public static void printAmortizationSchedule(List<AmortizationScheduleEntry> schedule) {
        System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Month", "Payment", "Interest", "Principal", "Balance");

        for (AmortizationScheduleEntry entry : schedule) {
            System.out.printf("%-10d%-20.2f%-20.2f%-20.2f%-20.2f\n",
                    entry.getMonth(),
                    entry.getMonthlyPayment(),
                    entry.getInterestPayment(),
                    entry.getPrincipalPayment(),
                    entry.getRemainingBalance());
        }
    }

    public static void main(String[] args) {
        double loanAmount = 20000;
        double annualInterestRate = 6.5;
        int termMonths = 60;

        List<AmortizationScheduleEntry> amortizationSchedule = generateAmortizationSchedule(loanAmount, annualInterestRate, termMonths);
        printAmortizationSchedule(amortizationSchedule);
    }
}


