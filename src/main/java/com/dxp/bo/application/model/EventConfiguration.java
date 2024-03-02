package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EventConfiguration {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String eventName;
    private String eventDescription;
    private String eventExecutor;
}
