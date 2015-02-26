/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author rulls
 */
@Entity
@Table(name = "companyBuilding")
@NamedQueries({
    @NamedQuery(name = "CompanyBuilding.findAll", query = "SELECT c FROM CompanyBuilding c"),
    @NamedQuery(name = "CompanyBuilding.findByCompanyBuildingID", query = "SELECT c FROM CompanyBuilding c WHERE c.companyBuildingID = :companyBuildingID"),
    @NamedQuery(name = "CompanyBuilding.findByTelephone", query = "SELECT c FROM CompanyBuilding c WHERE c.telephone = :telephone")})
public class CompanyBuilding implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "companyBuildingID")
    private Integer companyBuildingID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephone")
    private String telephone;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    @JoinColumn(name = "buildingID", referencedColumnName = "buildingID")
    @ManyToOne(optional = false)
    private Building building;

    public CompanyBuilding() {
    }

    public CompanyBuilding(Integer companyBuildingID) {
        this.companyBuildingID = companyBuildingID;
    }

    public CompanyBuilding(Integer companyBuildingID, String telephone) {
        this.companyBuildingID = companyBuildingID;
        this.telephone = telephone;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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
        hash += (companyBuildingID != null ? companyBuildingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyBuilding)) {
            return false;
        }
        CompanyBuilding other = (CompanyBuilding) object;
        if ((this.companyBuildingID == null && other.companyBuildingID != null) || (this.companyBuildingID != null && !this.companyBuildingID.equals(other.companyBuildingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.CompanyBuilding[ companyBuildingID=" + companyBuildingID + " ]";
    }
    
}
