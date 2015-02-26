/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "company")
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByCompanyID", query = "SELECT c FROM Company c WHERE c.companyID = :companyID"),
    @NamedQuery(name = "Company.findByCompanyName", query = "SELECT c FROM Company c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "Company.findByEmail", query = "SELECT c FROM Company c WHERE c.email = :email"),
    @NamedQuery(name = "Company.findByTelephone", query = "SELECT c FROM Company c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "Company.findByOfficeNumber", query = "SELECT c FROM Company c WHERE c.officeNumber = :officeNumber"),
    @NamedQuery(name = "Company.findByDateRegistered", query = "SELECT c FROM Company c WHERE c.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Company.findByFloorNumber", query = "SELECT c FROM Company c WHERE c.floorNumber = :floorNumber")})
public class Company implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyID")
    private List<Technician> technicianList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyID")
    private List<Administrator> administratorList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "companyID")
    private Integer companyID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyName")
    private String companyName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "officeNumber")
    private String officeNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "floorNumber")
    private String floorNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Assignment> assignmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Building> buildingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<CallType> callTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<CompanyBuilding> companyBuildingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<User> userList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Supervisor> supervisorList;

    public Company() {
    }

    public Company(Integer companyID) {
        this.companyID = companyID;
    }

    public Company(Integer companyID, String companyName, String email, String telephone, String officeNumber, Date dateRegistered, String floorNumber) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.email = email;
        this.telephone = telephone;
        this.officeNumber = officeNumber;
        this.dateRegistered = dateRegistered;
        this.floorNumber = floorNumber;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public List<CallType> getCallTypeList() {
        return callTypeList;
    }

    public void setCallTypeList(List<CallType> callTypeList) {
        this.callTypeList = callTypeList;
    }

    public List<CompanyBuilding> getCompanyBuildingList() {
        return companyBuildingList;
    }

    public void setCompanyBuildingList(List<CompanyBuilding> companyBuildingList) {
        this.companyBuildingList = companyBuildingList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Supervisor> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(List<Supervisor> supervisorList) {
        this.supervisorList = supervisorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyID != null ? companyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyID == null && other.companyID != null) || (this.companyID != null && !this.companyID.equals(other.companyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Company[ companyID=" + companyID + " ]";
    }

    public List<Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(List<Technician> technicianList) {
        this.technicianList = technicianList;
    }

    public List<Administrator> getAdministratorList() {
        return administratorList;
    }

    public void setAdministratorList(List<Administrator> administratorList) {
        this.administratorList = administratorList;
    }
    
}
