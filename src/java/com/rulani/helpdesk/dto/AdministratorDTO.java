/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;

import com.rulani.helpdesk.data.*;
import java.util.List;

/**
 *
 * @author rulls
 */

public class AdministratorDTO {
   
    private Integer administratorID;
    private int userID;
    private int callLoggedID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String telephone;
    private long dateRegistered;
    private List<AssignmentDTO> assignmentList;
    
    public AdministratorDTO() {
    }

    public AdministratorDTO(Administrator a){
        
        this.administratorID = a.getAdministratorID();
        this.userID = a.getUserID();
        this.callLoggedID = a.getCallLoggedID();
        this.firstName = a.getFirstName();
        this.lastName = a.getLastName();
        this.email = a.getEmail();
        this.password = a.getPassword();
        this.telephone = a.getTelephone();
        this.dateRegistered = a.getDateRegistered().getTime();
        
        
        
    }

    public Integer getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(int callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<AssignmentDTO> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<AssignmentDTO> assignmentList) {
        this.assignmentList = assignmentList;
    }
}

