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
import javax.validation.constraints.Size;

/**
 *
 * @author rulls
 */
@Entity
@Table(name = "administrator")
@NamedQueries({
    @NamedQuery(name = "Administrator.findAll", query = "SELECT a FROM Administrator a"),
    @NamedQuery(name = "Administrator.findByAdministratorID", query = "SELECT a FROM Administrator a WHERE a.administratorID = :administratorID"),
    @NamedQuery(name = "Administrator.findByUserID", query = "SELECT a FROM Administrator a WHERE a.userID = :userID"),
    @NamedQuery(name = "Administrator.findByCallLoggedID", query = "SELECT a FROM Administrator a WHERE a.callLoggedID = :callLoggedID"),
    @NamedQuery(name = "Administrator.findByFirstName", query = "SELECT a FROM Administrator a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "Administrator.findByLastName", query = "SELECT a FROM Administrator a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "Administrator.findByEmail", query = "SELECT a FROM Administrator a WHERE a.email = :email"),
    @NamedQuery(name = "Administrator.findByPassword", query = "SELECT a FROM Administrator a WHERE a.password = :password"),
    @NamedQuery(name = "Administrator.findByTelephone", query = "SELECT a FROM Administrator a WHERE a.telephone = :telephone"),
    @NamedQuery(name = "Administrator.findByDateRegistered", query = "SELECT a FROM Administrator a WHERE a.dateRegistered = :dateRegistered")})
public class Administrator implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrator")
    private List<Technician> technicianList;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "administratorID")
    private Integer administratorID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID")
    private int userID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "callLoggedID")
    private int callLoggedID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lastName")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrator")
    private List<Assignment> assignmentList;

    public Administrator() {
    }

    public Administrator(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public Administrator(Integer administratorID, int userID, int callLoggedID, String firstName, String lastName, String email, String password, String telephone, Date dateRegistered) {
        this.administratorID = administratorID;
        this.userID = userID;
        this.callLoggedID = callLoggedID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.dateRegistered = dateRegistered;
    }

    public Integer getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(int callLoggedID) {
        this.callLoggedID = callLoggedID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (administratorID != null ? administratorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.administratorID == null && other.administratorID != null) || (this.administratorID != null && !this.administratorID.equals(other.administratorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Administrator[ administratorID=" + administratorID + " ]";
    }

    public List<Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(List<Technician> technicianList) {
        this.technicianList = technicianList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

   
    
}
