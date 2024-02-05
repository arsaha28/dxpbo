package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class User {

    private String username;
    private String role;
    private Date startDate;
    private Date endDate;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }
}
