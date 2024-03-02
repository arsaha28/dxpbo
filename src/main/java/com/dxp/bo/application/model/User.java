package com.dxp.bo.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String username;
    private String role;
    private Date startDate;
    private Date endDate;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }
}
