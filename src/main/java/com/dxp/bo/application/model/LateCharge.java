package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class LateCharge {

    private BigDecimal chargeAmount;
    private Date calculationDate;
    private Date startDate;
    private Date endDate;

    public LateCharge(BigDecimal chargeAmount, Date calculationDate) {
        this.chargeAmount = chargeAmount;
        this.calculationDate = calculationDate;
    }

}
