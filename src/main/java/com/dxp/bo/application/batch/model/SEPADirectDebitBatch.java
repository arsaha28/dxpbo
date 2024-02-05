package com.dxp.bo.application.batch.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SEPADirectDebitBatch {
    private int batchID;
    private Date creationDate;
    private String creditorName;
    private String creditorIBAN;
    private List<SEPADirectDebitTransaction> transactions;

}
