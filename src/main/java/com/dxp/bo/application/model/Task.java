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
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String taskName;
    private String taskDescription;
    private Date creationDate;
    private boolean closed;
    @ManyToOne
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
