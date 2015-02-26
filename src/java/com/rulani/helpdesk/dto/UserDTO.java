/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;


import com.rulani.helpdesk.data.User;
import java.util.List;

/**
 *
 * @author rulls
 */

public class UserDTO {
   
    private Integer userID;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private long dateRegistered;
    private List<CallLoggedDTO> callLoggedList;
    private int companyID;

    public UserDTO() {
        
    }

    public UserDTO(User u) {
        userID = u.getUserID();
        firstName = u.getFirstName();
        email = u.getEmail();
        telephone = u.getTelephone();
        password = u.getPassword();
        dateRegistered = u.getDateRegistered().getTime();
        companyID = u.getCompany().getCompanyID();
        
        
        
        
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
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

    public List<CallLoggedDTO> getCallLoggedList() {
        return callLoggedList;
    }

    public void setCallLoggedList(List<CallLoggedDTO> callLoggedList) {
        this.callLoggedList = callLoggedList;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    
}
