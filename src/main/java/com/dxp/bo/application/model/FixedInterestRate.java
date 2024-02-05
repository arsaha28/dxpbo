package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class FixedInterestRate {

    private BigDecimal rate;
    private Date startDate;
    private Date endDate;

}

