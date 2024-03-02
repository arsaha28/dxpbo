package com.dxp.bo.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String eventName;
    private Date eventDate;
    private boolean approved;
    @ManyToOne
    private User approve;
    private Date startDate;
    private Date endDate;

}
