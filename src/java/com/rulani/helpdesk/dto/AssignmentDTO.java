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

public class AssignmentDTO  {
   
    private Integer assigmentID;
    private long dateAssigned;
    private int administratorID;
    private int companyID;
    private CallLoggedDTO callLogged;
    private int technicianID;
    private List<TechnicianResponseDTO> technicianResponseList;

    public AssignmentDTO() {
    }

    public AssignmentDTO(Assignment as) {
        this.assigmentID =as.getAssigmentID();
        this.dateAssigned = as.getDateAssigned().getTime();
        this.administratorID = as.getAdministrator().getAdministratorID();
        this.companyID = as.getCompany().getCompanyID();
        this.callLogged = new CallLoggedDTO(as.getCallLogged());
        this.technicianID= as.getTechnician().getTechnicianID();
        
        
        
        
        
    }

    public Integer getAssigmentID() {
        return assigmentID;
    }

    public void setAssigmentID(Integer assigmentID) {
        this.assigmentID = assigmentID;
    }

    public long getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(long dateAssigned) {
        this.dateAssigned = dateAssigned;
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

    public CallLoggedDTO getCallLogged() {
        return callLogged;
    }

    public void setCallLogged(CallLoggedDTO callLogged) {
        this.callLogged = callLogged;
    }

   

    public int getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(int technicianID) {
        this.technicianID = technicianID;
    }

    public List<TechnicianResponseDTO> getTechnicianResponseList() {
        return technicianResponseList;
    }

    public void setTechnicianResponseList(List<TechnicianResponseDTO> technicianResponseList) {
        this.technicianResponseList = technicianResponseList;
    }

    
}
