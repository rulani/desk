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
@Table(name = "supervisor")
@NamedQueries({
    @NamedQuery(name = "Supervisor.findAll", query = "SELECT s FROM Supervisor s"),
    @NamedQuery(name = "Supervisor.findBySupervisorID", query = "SELECT s FROM Supervisor s WHERE s.supervisorID = :supervisorID"),
    @NamedQuery(name = "Supervisor.findByFirstName", query = "SELECT s FROM Supervisor s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Supervisor.findByLastName", query = "SELECT s FROM Supervisor s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Supervisor.findByEmail", query = "SELECT s FROM Supervisor s WHERE s.email = :email"),
    @NamedQuery(name = "Supervisor.findByTelephone", query = "SELECT s FROM Supervisor s WHERE s.telephone = :telephone"),
    @NamedQuery(name = "Supervisor.findByPassword", query = "SELECT s FROM Supervisor s WHERE s.password = :password"),
    @NamedQuery(name = "Supervisor.findByDateRegistered", query = "SELECT s FROM Supervisor s WHERE s.dateRegistered = :dateRegistered")})
public class Supervisor implements Serializable {
    @JoinColumn(name = "callLoggedID", referencedColumnName = "callLoggedID")
    @ManyToOne(optional = false)
    private CallLogged callLoggedID;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "supervisorID")
    private Integer supervisorID;
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
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @JoinColumn(name = "companyID", referencedColumnName = "companyID")
    @ManyToOne(optional = false)
    private Company company;

    public Supervisor() {
    }

    public Supervisor(Integer supervisorID) {
        this.supervisorID = supervisorID;
    }

    public Supervisor(Integer supervisorID, String firstName, String lastName, String email, String telephone, String password, Date dateRegistered) {
        this.supervisorID = supervisorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.dateRegistered = dateRegistered;
    }

    public Integer getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(Integer supervisorID) {
        this.supervisorID = supervisorID;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supervisorID != null ? supervisorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supervisor)) {
            return false;
        }
        Supervisor other = (Supervisor) object;
        if ((this.supervisorID == null && other.supervisorID != null) || (this.supervisorID != null && !this.supervisorID.equals(other.supervisorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rulani.helpdesk.data.Supervisor[ supervisorID=" + supervisorID + " ]";
    }

    public CallLogged getCallLoggedID() {
        return callLoggedID;
    }

    public void setCallLoggedID(CallLogged callLoggedID) {
        this.callLoggedID = callLoggedID;
    }
    
}
