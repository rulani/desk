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

public class TechnicianDTO {
    
    private long dateRegistered; 
    private int administratorID; 
    private int companyID;
    private Integer technicianID;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String role;
    private List<AssignmentDTO> assignmentList;

    public TechnicianDTO() {
    }

    public TechnicianDTO(Technician t) {
        dateRegistered = t.getDateRegistered().getTime();
        administratorID = t.getAdministrator().getAdministratorID();
        companyID = t.getCompany().getCompanyID();
        technicianID = t.getTechnicianID();
        firstName = t.getFirstName();
        lastName = t.getLastName();
        email = t.getEmail();
        telephone = t.getTelephone();
        password = t.getPassword();
        role = t.getRole();
       
        
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public int getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(int administratorID) {
        this.administratorID = administratorID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<AssignmentDTO> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<AssignmentDTO> assignmentList) {
        this.assignmentList = assignmentList;
    }
    
}
    
    
