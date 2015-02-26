/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;

import com.rulani.helpdesk.data.*;
import java.util.Date;

/**
 *
 * @author rulls
 */ 
public class SupervisorDTO {
    
    private Integer supervisorID;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private long dateRegistered;
    private int companyID;
    
    
    public SupervisorDTO() {
    }

    public SupervisorDTO(Supervisor sp) {
        
        supervisorID = sp.getSupervisorID();
        firstName = sp.getFirstName();
        lastName = sp.getLastName();
        email = sp.getEmail();
        telephone = sp.getTelephone();
        password = sp.getPassword();
        dateRegistered = sp.getDateRegistered().getTime();
        companyID = sp.getCompany().getCompanyID();
        
        
    }

    public Integer getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(Integer supervisorID) {
        this.supervisorID = supervisorID;
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    
    
    
}
