/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Fpt
 */
public class Task {
    private int task_id;
    private String title;
    private String des;
    private Date start_date;
    private Date end_date;
    private int status;
    private Account task_from;
    private Account task_to;

    public Task() {
    }

    public Task(int task_id, String title, String des, Date start_date, Date end_date, int status, Account task_from, Account task_to) {
        this.task_id = task_id;
        this.title = title;
        this.des = des;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.task_from = task_from;
        this.task_to = task_to;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Account getTask_from() {
        return task_from;
    }

    public void setTask_from(Account task_from) {
        this.task_from = task_from;
    }

    public Account getTask_to() {
        return task_to;
    }

    public void setTask_to(Account task_to) {
        this.task_to = task_to;
    }
    
    
}
