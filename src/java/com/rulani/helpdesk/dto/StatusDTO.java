/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;

import com.rulani.helpdesk.data.Status;
import java.util.List;


/**
 *
 * @author rulls
 */

public class StatusDTO {
    
    private Integer statusID;
    private String statusName;
    private List<TechnicianResponseDTO> technicianResponseList;

    public StatusDTO() {
    }

    public StatusDTO(Status s) {
        this.statusID = s.getStatusID();
        this.statusName = s.getStatusName();
        
        
        
        
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public List<TechnicianResponseDTO> getTechnicianResponseList() {
        return technicianResponseList;
    }

    public void setTechnicianResponseList(List<TechnicianResponseDTO> technicianResponseList) {
        this.technicianResponseList = technicianResponseList;
    }

   
    
}
