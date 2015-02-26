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

public class CompanyBuildingDTO {
    
    private Integer companyBuildingID;
    private String telephone;
    private int companyID;
    private int buildingID;

    public CompanyBuildingDTO() {
    }

    public CompanyBuildingDTO(CompanyBuilding cb) {
        this.companyBuildingID = cb.getCompanyBuildingID();
        this.telephone = cb.getTelephone();
        this.companyID = cb.getCompany().getCompanyID();
        this.buildingID = cb.getBuilding().getBuildingID();
        
        
        
        
        
    }

    public Integer getCompanyBuildingID() {
        return companyBuildingID;
    }

    public void setCompanyBuildingID(Integer companyBuildingID) {
        this.companyBuildingID = companyBuildingID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

    
}
