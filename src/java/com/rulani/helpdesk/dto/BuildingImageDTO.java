/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;


import com.rulani.helpdesk.data.BuildingImage;


/**
 *
 * @author rulls
 */

public class BuildingImageDTO {
    
    private Integer buildingImageID;
    private String fileName;
    private long dateTaken;
    private int buildingID;

    public BuildingImageDTO() {
    }

    public BuildingImageDTO(BuildingImage bi) {
        this.buildingImageID = bi.getBuildingImageID();
        this.fileName = bi.getFileName();
        this.dateTaken = bi.getDateTaken().getTime();
        this.buildingID = bi.getBuilding().getBuildingID();
        
        
        
        
        
    }

    public Integer getBuildingImageID() {
        return buildingImageID;
    }

    public void setBuildingImageID(Integer buildingImageID) {
        this.buildingImageID = buildingImageID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(long dateTaken) {
        this.dateTaken = dateTaken;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

   
    
}
