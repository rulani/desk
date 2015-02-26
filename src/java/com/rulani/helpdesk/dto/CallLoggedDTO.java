/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;


import com.rulani.helpdesk.data.CallLogged;

import java.util.List;

/**
 *
 * @author rulls
 */
 
public class CallLoggedDTO  {
    
    private Integer callLoggedID;
    private String description;
    private long responseDate;
    private long dateLogged;
    private long dateCallClosed;
    private String ticketNumber;
    private List<AssignmentDTO> assignmentList;
    private int callTypeID;
    private int userID;

    public CallLoggedDTO() {
    }

    public CallLoggedDTO(CallLogged c) {
        this.callLoggedID = c.getCallLoggedID();
        this.description = c.getDescription();
        this.responseDate = c.getResponseDate().getTime();
        this.dateLogged = c.getDateLogged().getTime();
        this.dateCallClosed = c.getDateCallClosed().getTime();
        this.ticketNumber = c.getTicketNumber();
        this.callTypeID = c.getCallType().getCallTypeID();
        this.userID = c.getUser().getUserID();
        
        
        
        
        
        
    }

    public Integer getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(Integer callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(long responseDate) {
        this.responseDate = responseDate;
    }

    public long getDateLogged() {
        return dateLogged;
    }

    public void setDateLogged(long dateLogged) {
        this.dateLogged = dateLogged;
    }

    public long getDateCallClosed() {
        return dateCallClosed;
    }

    public void setDateCallClosed(long dateCallClosed) {
        this.dateCallClosed = dateCallClosed;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public List<AssignmentDTO> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<AssignmentDTO> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public int getCallTypeID() {
        return callTypeID;
    }

    public void setCallTypeID(int callTypeID) {
        this.callTypeID = callTypeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    
    
    
    
}
