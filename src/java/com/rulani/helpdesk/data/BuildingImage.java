/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author rulls
 */
@Entity
@Table(name = "buildingImage")
@NamedQueries({
    @NamedQuery(name = "BuildingImage.findAll", query = "SELECT b FROM BuildingImage b"),
    @NamedQuery(name = "BuildingImage.findByBuildingImageID", query = "SELECT b FROM BuildingImage b WHERE b.buildingImageID = :buildingImageID"),
    @NamedQuery(name = "BuildingImage.findByFileName", query = "SELECT b FROM BuildingImage b WHERE b.fileName = :fileName"),
    @NamedQuery(name = "BuildingImage.findByDateTaken", query = "SELECT b FROM BuildingImage b WHERE b.dateTaken = :dateTaken")})
public class BuildingImage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "buildingImageID")
    private Integer buildingImageID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fileName")
    private String fileName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateTaken")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTaken;
    @JoinColumn(name = "buildingID", referencedColumnName = "buildingID")
    @ManyToOne(optional = false)
    private Building building;

    public BuildingImage() {
    }

    public BuildingImage(Integer buildingImageID) {
        this.buildingImageID = buildingImageID;
    }

    public BuildingImage(Integer buildingImageID, String fileName, Date dateTaken) {
        this.buildingImageID = buildingImageID;
        this.fileName = fileName;
        this.dateTaken = dateTaken;
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

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buildingImageID != null ? buildingImageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuildingImage)) {
            return false;
        }
        BuildingImage other = (BuildingImage) object;
        if ((this.buildingImageID == null && other.buildingImageID != null) || (this.buildingImageID != null && !this.buildingImageID.equals(other.buildingImageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.BuildingImage[ buildingImageID=" + buildingImageID + " ]";
    }
    
}
