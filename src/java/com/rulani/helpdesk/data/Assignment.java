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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rulls
 */
@Entity
@Table(name = "assignment")
@NamedQueries({
    @NamedQuery(name = "Assignment.findAll", query = "SELECT a FROM Assignment a"),
    @NamedQuery(name = "Assignment.findByAssigmentID", query = "SELECT a FROM Assignment a WHERE a.assigmentID = :assigmentID"),
    @NamedQuery(name = "Assignment.findByDateAssigned", query = "SELECT a FROM Assignment a WHERE a.dateAssigned = :dateAssigned")})
public class Assignment implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignmentID")
    private List<Technician> technicianList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assigmentID")
    private Integer assigmentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateAssigned")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAssigned;
    @JoinColumn(name = "administratorID", referencedColumnName = "administratorID")
    @ManyToOne(optional = false)
    private Administrator administrator;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    @JoinColumn(name = "callLoggedID", referencedColumnName = "callLoggedID")
    @ManyToOne(optional = false)
    private CallLogged callLogged;
    @JoinColumn(name = "technicianID", referencedColumnName = "technicianID")
    @ManyToOne(optional = false)
    private Technician technician;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignment")
    private List<TechnicianResponse> technicianResponseList;

    public Assignment() {
    }

    public Assignment(Integer assigmentID) {
        this.assigmentID = assigmentID;
    }

    public Assignment(Integer assigmentID, Date dateAssigned) {
        this.assigmentID = assigmentID;
        this.dateAssigned = dateAssigned;
    }

    public Integer getAssigmentID() {
        return assigmentID;
    }

    public void setAssigmentID(Integer assigmentID) {
        this.assigmentID = assigmentID;
    }

    public Date getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Date dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CallLogged getCallLogged() {
        return callLogged;
    }

    public void setCallLogged(CallLogged callLogged) {
        this.callLogged = callLogged;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    

    public List<TechnicianResponse> getTechnicianResponseList() {
        return technicianResponseList;
    }

    public void setTechnicianResponseList(List<TechnicianResponse> technicianResponseList) {
        this.technicianResponseList = technicianResponseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assigmentID != null ? assigmentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assignment)) {
            return false;
        }
        Assignment other = (Assignment) object;
        if ((this.assigmentID == null && other.assigmentID != null) || (this.assigmentID != null && !this.assigmentID.equals(other.assigmentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Assignment[ assigmentID=" + assigmentID + " ]";
    }

    public List<Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(List<Technician> technicianList) {
        this.technicianList = technicianList;
    }
    
}
