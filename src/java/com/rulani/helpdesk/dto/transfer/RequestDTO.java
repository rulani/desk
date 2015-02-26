/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto.transfer;

import com.rulani.helpdesk.dto.AdministratorDTO;
import com.rulani.helpdesk.dto.AssignmentDTO;
import com.rulani.helpdesk.dto.BuildingDTO;
import com.rulani.helpdesk.dto.BuildingImageDTO;
import com.rulani.helpdesk.dto.CallLoggedDTO;
import com.rulani.helpdesk.dto.CallTypeDTO;
import com.rulani.helpdesk.dto.CompanyBuildingDTO;
import com.rulani.helpdesk.dto.CompanyDTO;
import com.rulani.helpdesk.dto.StatusDTO;
import com.rulani.helpdesk.dto.SupervisorDTO;
import com.rulani.helpdesk.dto.TechnicianDTO;
import com.rulani.helpdesk.dto.TechnicianResponseDTO;
import com.rulani.helpdesk.dto.UserDTO;

/**
 *
 * @author rulls
 */
public class RequestDTO {

    //LOGIN
    public static final int LOGIN_ADMINISTRATOR = 1;
    public static final int LOGIN_SUPERVISOR = 2;
    public static final int LOGIN_TECHNICIAN = 3;
    public static final int LOGIN_USER = 4;

    // administrator
    public static final int REGISTER_ADMINISTRATOR = 10;
    public static final int REGISTER_TECHNICIAN = 11;
    public static final int REGISTER_USER = 12;
    public static final int REGISTER_SUPERVISOR = 13;
    public static final int DEACTIVATE_ADMINISTRTATOR = 14;
    public static final int DEACTIVATE_SUPERVISOR = 15;
    public static final int DEACTIVATE_TECHNICIAN = 16;
    public static final int DEACTIVATE_USER = 17;
    public static final int UPDATE_ADMINISTRTATOR = 18;
    public static final int UPDATE_SUPERVISOR = 19;
    public static final int UPDATE_TECHNICIAN = 20;
    public static final int UPDATE_USER = 21;
    public static final int GET_CALLLOGGED_LIST = 22;
    public static final int GET_ASSIGNMENT_LIST = 23;
    public static final int GET_TECHNICIAN_RESPONSE = 24;
    public static final int GET_COMPANYBUILDING_LIST = 25;
    public static final int GET_ADMINISTRATOR_LIST = 26;
    public static final int GET_TECHNICIAN_LIST = 27;
    public static final int GET_USER_LIST = 28;
    public static final int GET_SUPERVISOR_LIST = 29;

    //
    public static final int UPDATE_CALLLOGGED = 30;
    public static final int DELETE_CALLLOGGED = 30;
    public static final int ADD_COMPANYBUILDING = 31;
    public static final int ADD_COMPANY = 32;
    public static final int UPDATE_COMPANYBUILDING = 33;
    public static final int DEACTIVATE_COMPANY = 34;
    public static final int GET_COMPANY_CALLLOGGED = 35;
    public static final int ASSIGN_CALLLOGGED = 36;
    public static final int ADD_CALLTYPE = 37;
    public static final int UPDATE_CALLTYPE = 38;
    public static final int ADD_BUILDING = 39;
    public static final int GET_STATUS_LIST = 40;
    public static final int ADD_BUILDINGIMAGE = 41;
    public static final int UPDATE_STATUS = 42;
    public static final int GET_CALLTYPE_LIST = 31;

    //
    public static final int SEND_PASSWORD_ADMINISTRATOR = 50;
    public static final int SEND_PASSWORD_SUPERVISOR = 55;
    public static final int SEND_PASSWORD_TECHNICIAN = 60;
    public static final int SEND_PASSWORD_USER = 65;

    private Integer requestType, administratorID, assignmentID, buildingID, buildingImageID, callLoggedID, 
            callTypeID,companyBuildingID, companyID, statusID, supervisorID, technicianID, 
            technicianResponseID, userID;
    
    private AdministratorDTO administrator;
    private AssignmentDTO assignment;
    private BuildingDTO building;
    private BuildingImageDTO buildingImage;
    private CallLoggedDTO callLogged;
    private CallTypeDTO callType;
    private CompanyBuildingDTO companyBuilding;
    private CompanyDTO company;
    private StatusDTO status;
    private SupervisorDTO supervisor;
    private TechnicianDTO technician;
    private TechnicianResponseDTO technicianResponse;
    private UserDTO user;

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Integer getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public Integer getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(Integer assignmentID) {
        this.assignmentID = assignmentID;
    }

    public Integer getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Integer buildingID) {
        this.buildingID = buildingID;
    }

    public Integer getBuildingImageID() {
        return buildingImageID;
    }

    public void setBuildingImageID(Integer buildingImageID) {
        this.buildingImageID = buildingImageID;
    }

    public Integer getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(Integer callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public Integer getCallTypeID() {
        return callTypeID;
    }

    public void setCallTypeID(Integer callTypeID) {
        this.callTypeID = callTypeID;
    }

    public Integer getCompanyBuildingID() {
        return companyBuildingID;
    }

    public void setCompanyBuildingID(Integer companyBuildingID) {
        this.companyBuildingID = companyBuildingID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(Integer supervisorID) {
        this.supervisorID = supervisorID;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public Integer getTechnicianResponseID() {
        return technicianResponseID;
    }

    public void setTechnicianResponseID(Integer technicianResponseID) {
        this.technicianResponseID = technicianResponseID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public AdministratorDTO getAdministrator() {
        return administrator;
    }

    public void setAdministrator(AdministratorDTO administrator) {
        this.administrator = administrator;
    }

    public AssignmentDTO getAssignment() {
        return assignment;
    }

    public void setAssignment(AssignmentDTO assignment) {
        this.assignment = assignment;
    }

    public BuildingDTO getBuilding() {
        return building;
    }

    public void setBuilding(BuildingDTO building) {
        this.building = building;
    }

    public BuildingImageDTO getBuildingImage() {
        return buildingImage;
    }

    public void setBuildingImage(BuildingImageDTO buildingImage) {
        this.buildingImage = buildingImage;
    }

    public CallLoggedDTO getCallLogged() {
        return callLogged;
    }

    public void setCallLogged(CallLoggedDTO callLogged) {
        this.callLogged = callLogged;
    }

    public CallTypeDTO getCallType() {
        return callType;
    }

    public void setCallType(CallTypeDTO callType) {
        this.callType = callType;
    }

    public CompanyBuildingDTO getCompanyBuilding() {
        return companyBuilding;
    }

    public void setCompanyBuilding(CompanyBuildingDTO companyBuilding) {
        this.companyBuilding = companyBuilding;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    public SupervisorDTO getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(SupervisorDTO supervisor) {
        this.supervisor = supervisor;
    }

    public TechnicianDTO getTechnician() {
        return technician;
    }

    public void setTechnician(TechnicianDTO technician) {
        this.technician = technician;
    }

    public TechnicianResponseDTO getTechnicianResponse() {
        return technicianResponse;
    }

    public void setTechnicianResponse(TechnicianResponseDTO technicianResponse) {
        this.technicianResponse = technicianResponse;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
    
    
    
}

