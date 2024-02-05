package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.LateCharge;

import java.math.BigDecimal;
import java.util.Date;

public class LateChargeCalculator {

    public LateCharge calculateLateCharge(BigDecimal outstandingAmount, BigDecimal interestRate, Date dueDate, Date paymentDate) {
        // Simple late charge calculation logic (customize as needed)
        BigDecimal lateChargePercentage = new BigDecimal(0.02); // 2% late charge per month
        BigDecimal lateChargeAmount = outstandingAmount .multiply(interestRate);

        // Create LateCharge object
        LateCharge lateCharge = new LateCharge(lateChargeAmount, paymentDate);

        return lateCharge;
    }

    public static void main(String[] args) {
        LateChargeCalculator calculator = new LateChargeCalculator();

        // Example usage
        BigDecimal outstandingAmount = new BigDecimal("1000.0");
        BigDecimal interestRate = new BigDecimal("0.05"); // 5%
        Date dueDate = new Date(); // Due date (replace with actual due date)
        Date paymentDate = new Date(); // Payment date (replace with actual payment date)

        LateCharge lateCharge = calculator.calculateLateCharge(outstandingAmount, interestRate, dueDate, paymentDate);

        System.out.println("Late Charge Calculation Result:");
        System.out.println(lateCharge);
    }
}
