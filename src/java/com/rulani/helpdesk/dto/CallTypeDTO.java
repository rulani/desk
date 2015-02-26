/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.dto;

import com.rulani.helpdesk.data.*;

import java.util.List;

/**
 *
 * @author rulls
 */
public class CallTypeDTO {

    private Integer callTypeID;
    private String callTypeName;
    private int companyID;
    private List<CallLoggedDTO> callLoggedList;

    public CallTypeDTO() {
    }

    public CallTypeDTO(CallType ct) {

        this.callTypeID = ct.getCallTypeID();
        this.callTypeName = ct.getCallTypeName();
        this.companyID = ct.getCompany().getCompanyID();

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

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public List<CallLoggedDTO> getCallLoggedList() {
        return callLoggedList;
    }

    public void setCallLoggedList(List<CallLoggedDTO> callLoggedList) {
        this.callLoggedList = callLoggedList;
    }

}
