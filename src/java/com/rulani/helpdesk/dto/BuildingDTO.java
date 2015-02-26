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

public class BuildingDTO  {
   
    private Integer buildingID;
    private String buildingName;
    private List<BuildingImageDTO> buildingImageList;
    private int companyID;
    private List<CompanyBuildingDTO> companyBuildingList;

    public BuildingDTO() {
    }

    public BuildingDTO(Building b) {
        buildingID = b.getBuildingID();
        buildingName = b.getBuildingName();
        companyID = b.getCompany().getCompanyID();
        
    }

    public Integer getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Integer buildingID) {
        this.buildingID = buildingID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public List<BuildingImageDTO> getBuildingImageList() {
        return buildingImageList;
    }

    public void setBuildingImageList(List<BuildingImageDTO> buildingImageList) {
        this.buildingImageList = buildingImageList;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public List<CompanyBuildingDTO> getCompanyBuildingList() {
        return companyBuildingList;
    }

    public void setCompanyBuildingList(List<CompanyBuildingDTO> companyBuildingList) {
        this.companyBuildingList = companyBuildingList;
    }
    
    

    
    
}
