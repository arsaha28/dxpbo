package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class LoanStep {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public LoanStep(String name) {
        this.name = name;
    }


}
