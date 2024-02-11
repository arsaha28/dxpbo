package com.dxp.bo.application.batch.latecharge;

import java.util.Date;

public class LateChargeCalculator {
    private double interestRate; // Interest rate for late charges
    private double loanAmount; // Total loan amount

    public LateChargeCalculator(double interestRate, double loanAmount) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    // Method to calculate late charge for a missed EMI payment
    public double calculateLateCharge(Date currentDate, Date dueDate) {
        // Calculate the number of days late
        long daysLate = (currentDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);

        // Calculate the late charge based on the interest rate and the loan amount
        double lateCharge = (interestRate / 100) * loanAmount * (daysLate / 30.0);

        return lateCharge;
    }

    public static void main(String[] args) {
        // Example usage
        double interestRate = 2.5; // Interest rate for late charges (2.5% per month)
        double loanAmount = 10000; // Total loan amount
        LateChargeCalculator calculator = new LateChargeCalculator(interestRate, loanAmount);

        // Example: Calculate late charge for a payment missed for 10 days
        Date currentDate = new Date(); // Current date
        Date dueDate = new Date(); // Due date (Assuming due date was 10 days ago)
        dueDate.setTime(dueDate.getTime() - (10 * 24 * 60 * 60 * 1000)); // Subtract 10 days from the current date

        double lateCharge = calculator.calculateLateCharge(currentDate, dueDate);
        System.out.println("Late Charge: $" + lateCharge);
    }
}
