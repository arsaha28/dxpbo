package com.dxp.bo.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class Task {
    private String taskName;
    private String taskDescription;
    private Date creationDate;
    private boolean closed;
    private User assignedUser;

    public void closeTask() {
        this.closed = true;
    }

    public Task(String taskName, String taskDescription, Date creationDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.creationDate = creationDate;
    }




}
