package com.dxp.bo.application.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreditScore {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private int creditScoreID;
    private int customerID;
    private int score;
    private Date scoreDate;
    private Date startDate;
    private Date endDate;

}
