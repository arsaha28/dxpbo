package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
@AllArgsConstructor
public class CreditScore {
    private int creditScoreID;
    private int customerID;
    private int score;
    private Date scoreDate;
    private Date startDate;
    private Date endDate;

}
