/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;


import com.rulani.helpdesk.data.TechnicianResponse;


/**
 *
 * @author rulls
 */

public class TechnicianResponseDTO {
    
    private Integer technicianResponseID;
    private String comment;
    private long responseDate;
    private int statusID;
    private int assignmentID;

    public TechnicianResponseDTO() {
    }

    public TechnicianResponseDTO(TechnicianResponse tr) {
        technicianResponseID = tr.getTechnicianResponseID();
        comment = tr.getComment();
        responseDate = tr.getResponseDate().getTime();
        statusID = tr.getStatus().getStatusID();
        assignmentID = tr.getAssignment().getAssigmentID();
        
    }

    public Integer getTechnicianResponseID() {
        return technicianResponseID;
    }

    public void setTechnicianResponseID(Integer technicianResponseID) {
        this.technicianResponseID = technicianResponseID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(long responseDate) {
        this.responseDate = responseDate;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    
    
    
}
