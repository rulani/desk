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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "callLogged")
@NamedQueries({
    @NamedQuery(name = "CallLogged.findAll", query = "SELECT c FROM CallLogged c"),
    @NamedQuery(name = "CallLogged.findByCallLoggedID", query = "SELECT c FROM CallLogged c WHERE c.callLoggedID = :callLoggedID"),
    @NamedQuery(name = "CallLogged.findByResponseDate", query = "SELECT c FROM CallLogged c WHERE c.responseDate = :responseDate"),
    @NamedQuery(name = "CallLogged.findByDateLogged", query = "SELECT c FROM CallLogged c WHERE c.dateLogged = :dateLogged"),
    @NamedQuery(name = "CallLogged.findByDateCallClosed", query = "SELECT c FROM CallLogged c WHERE c.dateCallClosed = :dateCallClosed"),
    @NamedQuery(name = "CallLogged.findByTicketNumber", query = "SELECT c FROM CallLogged c WHERE c.ticketNumber = :ticketNumber")})
public class CallLogged implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "callLogged")
    private List<Administrator> administratorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "callLogged")
    private List<Supervisor> supervisorList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "callLoggedID")
    private Integer callLoggedID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "responseDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateLogged")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLogged;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCallClosed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCallClosed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ticketNumber")
    private String ticketNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "callLogged")
    private List<Assignment> assignmentList;
    @JoinColumn(name = "callTypeID", referencedColumnName = "callTypeID")
    @ManyToOne(optional = false)
    private CallType callType;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false)
    private User user;

    public CallLogged() {
    }

    public CallLogged(Integer callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public CallLogged(Integer callLoggedID, String description, Date responseDate, Date dateLogged, Date dateCallClosed, String ticketNumber) {
        this.callLoggedID = callLoggedID;
        this.description = description;
        this.responseDate = responseDate;
        this.dateLogged = dateLogged;
        this.dateCallClosed = dateCallClosed;
        this.ticketNumber = ticketNumber;
    }

    public Integer getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(Integer callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Date getDateLogged() {
        return dateLogged;
    }

    public void setDateLogged(Date dateLogged) {
        this.dateLogged = dateLogged;
    }

    public Date getDateCallClosed() {
        return dateCallClosed;
    }

    public void setDateCallClosed(Date dateCallClosed) {
        this.dateCallClosed = dateCallClosed;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public CallType getCallType() {
        return callType;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (callLoggedID != null ? callLoggedID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CallLogged)) {
            return false;
        }
        CallLogged other = (CallLogged) object;
        if ((this.callLoggedID == null && other.callLoggedID != null) || (this.callLoggedID != null && !this.callLoggedID.equals(other.callLoggedID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.CallLogged[ callLoggedID=" + callLoggedID + " ]";
    }

    public List<Administrator> getAdministratorList() {
        return administratorList;
    }

    public void setAdministratorList(List<Administrator> administratorList) {
        this.administratorList = administratorList;
    }

    public List<Supervisor> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(List<Supervisor> supervisorList) {
        this.supervisorList = supervisorList;
    }
    
}
