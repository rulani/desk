/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;


import com.rulani.helpdesk.data.Company;
import java.util.List;

/**
 *
 * @author rulls
 */

public class CompanyDTO {
    
    private Integer companyID;
    private String companyName;
    private String email;
    private String telephone;
    private String officeNumber;
    private long dateRegistered;
    private String floorNumber;
    private List<AssignmentDTO> assignmentList;
    private List<BuildingDTO> buildingList;
    private List<CallTypeDTO> callTypeList;
    private List<CompanyBuildingDTO> companyBuildingList;
    private List<UserDTO> userList;
    private List<SupervisorDTO> supervisorList;

    public CompanyDTO() {
    }

    public CompanyDTO(Company co) {
        this.companyID = co.getCompanyID();
        this.companyName = co.getCompanyName();
        this.email = co.getEmail();
        this.telephone = co.getTelephone();
        this.officeNumber = co.getOfficeNumber();
        this.dateRegistered = co.getDateRegistered().getTime();
        this.floorNumber = co.getFloorNumber();
        
        
        
        
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<AssignmentDTO> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<AssignmentDTO> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public List<BuildingDTO> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<BuildingDTO> buildingList) {
        this.buildingList = buildingList;
    }

    public List<CallTypeDTO> getCallTypeList() {
        return callTypeList;
    }

    public void setCallTypeList(List<CallTypeDTO> callTypeList) {
        this.callTypeList = callTypeList;
    }

    public List<CompanyBuildingDTO> getCompanyBuildingList() {
        return companyBuildingList;
    }

    public void setCompanyBuildingList(List<CompanyBuildingDTO> companyBuildingList) {
        this.companyBuildingList = companyBuildingList;
    }

    public List<UserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }

    public List<SupervisorDTO> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(List<SupervisorDTO> supervisorList) {
        this.supervisorList = supervisorList;
    }

    
    
}
