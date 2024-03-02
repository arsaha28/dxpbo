package com.dxp.bo.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Phase {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Step> steps;

    private transient Step step;
    public Phase(String name) {
        this.name = name;
    }
}
