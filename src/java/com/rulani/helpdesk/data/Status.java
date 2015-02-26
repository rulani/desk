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
import javax.persistence.Id;
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
@Table(name = "status")
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findByStatusID", query = "SELECT s FROM Status s WHERE s.statusID = :statusID"),
    @NamedQuery(name = "Status.findByStatusName", query = "SELECT s FROM Status s WHERE s.statusName = :statusName")})
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusID")
    private Integer statusID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "statusName")
    private String statusName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<TechnicianResponse> technicianResponseList;

    public Status() {
    }

    public Status(Integer statusID) {
        this.statusID = statusID;
    }

    public Status(Integer statusID, String statusName) {
        this.statusID = statusID;
        this.statusName = statusName;
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

    public List<TechnicianResponse> getTechnicianResponseList() {
        return technicianResponseList;
    }

    public void setTechnicianResponseList(List<TechnicianResponse> technicianResponseList) {
        this.technicianResponseList = technicianResponseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusID != null ? statusID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.statusID == null && other.statusID != null) || (this.statusID != null && !this.statusID.equals(other.statusID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Status[ statusID=" + statusID + " ]";
    }
    
}
