package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LateCharge {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private BigDecimal chargeAmount;
    private Date calculationDate;
    private Date startDate;
    private Date endDate;

    public LateCharge(BigDecimal chargeAmount, Date calculationDate) {
        this.chargeAmount = chargeAmount;
        this.calculationDate = calculationDate;
    }

}
