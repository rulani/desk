/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.util;

/**
 *
 * @author rulls
 */
public class DataException extends Exception {
    
    String description;
    
    public DataException (String description){
        super(description);
        this.description = description;        
    }
    
    public String getDescription(){
       
    return description;
   
    }
    
    
}
