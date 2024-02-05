package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class LoanEvent {
    private String eventName;
    private Date eventDate;
    private boolean approved;
    private User approve;
    private Date startDate;
    private Date endDate;

}
