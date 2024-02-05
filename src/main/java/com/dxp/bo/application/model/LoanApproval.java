package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class LoanApproval {
    private User user;
    private LoanEvent loanEvent;
    private Date startDate;
    private Date endDate;

}