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
@Table(name = "callType")
@NamedQueries({
    @NamedQuery(name = "CallType.findAll", query = "SELECT c FROM CallType c"),
    @NamedQuery(name = "CallType.findByCallTypeID", query = "SELECT c FROM CallType c WHERE c.callTypeID = :callTypeID"),
    @NamedQuery(name = "CallType.findByCallTypeName", query = "SELECT c FROM CallType c WHERE c.callTypeName = :callTypeName")})
public class CallType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "callTypeID")
    private Integer callTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "callTypeName")
    private String callTypeName;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "callType")
    private List<CallLogged> callLoggedList;

    public CallType() {
    }

    public CallType(Integer callTypeID) {
        this.callTypeID = callTypeID;
    }

    public CallType(Integer callTypeID, String callTypeName) {
        this.callTypeID = callTypeID;
        this.callTypeName = callTypeName;
    }

    public Integer getCallTypeID() {
        return callTypeID;
    }

    public void setCallTypeID(Integer callTypeID) {
        this.callTypeID = callTypeID;
    }

    public String getCallTypeName() {
        return callTypeName;
    }

    public void setCallTypeName(String callTypeName) {
        this.callTypeName = callTypeName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    

    public List<CallLogged> getCallLoggedList() {
        return callLoggedList;
    }

    public void setCallLoggedList(List<CallLogged> callLoggedList) {
        this.callLoggedList = callLoggedList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (callTypeID != null ? callTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CallType)) {
            return false;
        }
        CallType other = (CallType) object;
        if ((this.callTypeID == null && other.callTypeID != null) || (this.callTypeID != null && !this.callTypeID.equals(other.callTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.CallType[ callTypeID=" + callTypeID + " ]";
    }
    
}
