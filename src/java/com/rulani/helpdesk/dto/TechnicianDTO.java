/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;

import com.rulani.helpdesk.data.*;




/**
 *
 * @author rulls
 */

public class TechnicianDTO {
    
    private Integer technicianID;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private long dateRegistered; 
    private String role;
    
    

    public TechnicianDTO() {
    }

    public TechnicianDTO(Technician t) {
        this.technicianID = t.getTechnicianID();
        this.firstName = t.getFirstName();
        this.lastName = t.getLastName();
        this.email = t.getEmail();
        this.telephone = t.getTelephone();
        this.password = t.getPassword();
        this.dateRegistered = t.getDateRegistered().getTime();
        this.role = t.getRole();
        
       
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
