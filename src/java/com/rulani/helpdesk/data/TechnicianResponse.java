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
import javax.persistence.Lob;
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
@Table(name = "technicianResponse")
@NamedQueries({
    @NamedQuery(name = "TechnicianResponse.findAll", query = "SELECT t FROM TechnicianResponse t"),
    @NamedQuery(name = "TechnicianResponse.findByTechnicianResponseID", query = "SELECT t FROM TechnicianResponse t WHERE t.technicianResponseID = :technicianResponseID"),
    @NamedQuery(name = "TechnicianResponse.findByResponseDate", query = "SELECT t FROM TechnicianResponse t WHERE t.responseDate = :responseDate")})
public class TechnicianResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "technicianResponseID")
    private Integer technicianResponseID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "responseDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseDate;
    @JoinColumn(name = "statusID", referencedColumnName = "statusID")
    @ManyToOne(optional = false)
    private Status status;
    @JoinColumn(name = "assignmentID", referencedColumnName = "assigmentID")
    @ManyToOne(optional = false)
    private Assignment assignment;

    public TechnicianResponse() {
    }

    public TechnicianResponse(Integer technicianResponseID) {
        this.technicianResponseID = technicianResponseID;
    }

    public TechnicianResponse(Integer technicianResponseID, String comment, Date responseDate) {
        this.technicianResponseID = technicianResponseID;
        this.comment = comment;
        this.responseDate = responseDate;
    }

    public Integer getTechnicianResponseID() {
        return technicianResponseID;
    }

    public void setTechnicianResponseID(Integer technicianResponseID) {
        this.technicianResponseID = technicianResponseID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (technicianResponseID != null ? technicianResponseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechnicianResponse)) {
            return false;
        }
        TechnicianResponse other = (TechnicianResponse) object;
        if ((this.technicianResponseID == null && other.technicianResponseID != null) || (this.technicianResponseID != null && !this.technicianResponseID.equals(other.technicianResponseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.TechnicianResponse[ technicianResponseID=" + technicianResponseID + " ]";
    }
    
}
