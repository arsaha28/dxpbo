package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class Step {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public Step(String name) {
        this.name = name;
    }


}
