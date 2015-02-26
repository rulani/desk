/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author rulls
 */
@Entity
@Table(name = "building")
@NamedQueries({
    @NamedQuery(name = "Building.findAll", query = "SELECT b FROM Building b"),
    @NamedQuery(name = "Building.findByBuildingID", query = "SELECT b FROM Building b WHERE b.buildingID = :buildingID"),
    @NamedQuery(name = "Building.findByBuildingName", query = "SELECT b FROM Building b WHERE b.buildingName = :buildingName")})
public class Building implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private double latitude;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "buildingID")
    private Integer buildingID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "buildingName")
    private String buildingName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    private List<BuildingImage> buildingImageList;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    private List<CompanyBuilding> companyBuildingList;

    public Building() {
    }

    public Building(Integer buildingID) {
        this.buildingID = buildingID;
    }

    public Building(Integer buildingID, String buildingName) {
        this.buildingID = buildingID;
        this.buildingName = buildingName;
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

    public List<BuildingImage> getBuildingImageList() {
        return buildingImageList;
    }

    public void setBuildingImageList(List<BuildingImage> buildingImageList) {
        this.buildingImageList = buildingImageList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    

    public List<CompanyBuilding> getCompanyBuildingList() {
        return companyBuildingList;
    }

    public void setCompanyBuildingList(List<CompanyBuilding> companyBuildingList) {
        this.companyBuildingList = companyBuildingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buildingID != null ? buildingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Building)) {
            return false;
        }
        Building other = (Building) object;
        if ((this.buildingID == null && other.buildingID != null) || (this.buildingID != null && !this.buildingID.equals(other.buildingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Building[ buildingID=" + buildingID + " ]";
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
}
