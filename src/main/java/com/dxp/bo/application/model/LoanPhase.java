package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class LoanPhase {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<LoanStep> steps = Collections.emptyList();

    public LoanPhase(String name) {
        this.name = name;
    }
}
