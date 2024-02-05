package com.dxp.bo.application.batch.model;

import lombok.Data;

import java.util.Date;

@Data
public class SEPADirectDebitTransaction {
    private int transactionID;
    private String debtorName;
    private String debtorIBAN;
    private double amount;
    private Date dueDate;

}
