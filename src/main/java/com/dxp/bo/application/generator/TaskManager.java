package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.Task;
import com.dxp.bo.application.model.User;

import java.util.Date;

public class TaskManager {
    public Task createTask(String taskName, String taskDescription, Date creationDate) {
        return new Task(taskName, taskDescription, creationDate);
    }

    public void assignUserToTask(Task task, User user) {
        task.setAssignedUser(user);
    }

    public void closeTask(Task task) {
        task.closeTask();
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Example: User submits an event, create a task and assign a user
        Task eventTask = taskManager.createTask("Submit Event Task", "User submitted an event", new Date());
        User assignedUser = new User("JohnDoe", "Employee");
        taskManager.assignUserToTask(eventTask, assignedUser);

        System.out.println("Task Created and Assigned: " + eventTask);

        // Example: Event is approved, close the associated task
        // Simulating the event approval process
        taskManager.closeTask(eventTask);
        System.out.println("Task Closed: " + eventTask);
    }
}
