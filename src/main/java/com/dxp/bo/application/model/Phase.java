package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class Phase {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<Step> steps = new ArrayList<>();

    public Phase(String name) {
        this.name = name;
    }
}
