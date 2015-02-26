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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rulls
 */
public class ResponseDTO {

    private Integer statusCode;

    private String message, GCMRegistrationID;
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

    private List<AssignmentDTO> assignmentList = new ArrayList<>();
    private List<TechnicianResponseDTO> technicianResponseList = new ArrayList<>();
    private List<CompanyBuildingDTO> companyBuildingList = new ArrayList<>();
    private List<BuildingImageDTO> buildingImageList = new ArrayList<>();
    private List<CallLoggedDTO> callLoggedList = new ArrayList<>();
    private List<BuildingDTO> buildingList = new ArrayList<>();
    private List<CallTypeDTO> callTypeList = new ArrayList<>();
    private List<UserDTO> userList = new ArrayList<>();
    private List<SupervisorDTO> supervisorList = new ArrayList<>();
    

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGCMRegistrationID() {
        return GCMRegistrationID;
    }

    public void setGCMRegistrationID(String GCMRegistrationID) {
        this.GCMRegistrationID = GCMRegistrationID;
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

    public List<AssignmentDTO> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<AssignmentDTO> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public List<TechnicianResponseDTO> getTechnicianResponseList() {
        return technicianResponseList;
    }

    public void setTechnicianResponseList(List<TechnicianResponseDTO> technicianResponseList) {
        this.technicianResponseList = technicianResponseList;
    }

    public List<CompanyBuildingDTO> getCompanyBuildingList() {
        return companyBuildingList;
    }

    public void setCompanyBuildingList(List<CompanyBuildingDTO> companyBuildingList) {
        this.companyBuildingList = companyBuildingList;
    }

    public List<BuildingImageDTO> getBuildingImageList() {
        return buildingImageList;
    }

    public void setBuildingImageList(List<BuildingImageDTO> buildingImageList) {
        this.buildingImageList = buildingImageList;
    }

    public List<CallLoggedDTO> getCallLoggedList() {
        return callLoggedList;
    }

    public void setCallLoggedList(List<CallLoggedDTO> callLoggedList) {
        this.callLoggedList = callLoggedList;
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
