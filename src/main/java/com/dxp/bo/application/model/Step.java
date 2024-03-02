package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@Entity
public class Step {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public Step(String name) {
        this.name = name;
    }


}
