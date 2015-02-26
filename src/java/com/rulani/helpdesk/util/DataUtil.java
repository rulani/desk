/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rulani.helpdesk.util;

import com.rulani.helpdesk.data.Company;
import com.rulani.helpdesk.data.User;
import com.rulani.helpdesk.dto.UserDTO;
import com.rulani.helpdesk.dto.transfer.ResponseDTO;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.logging.Logger;

/**
 *
 * @author rulls
 */

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DataUtil {
      @PersistenceContext
    private EntityManager em;
      
      public ResponseDTO RegisterUser(UserDTO user) throws DataException{
          ResponseDTO resp = new ResponseDTO();
          try{
              User u = new User();             
              u.setCompany(em.find(Company.class, user.getCompanyID()));
              u.setLastName(user.getLastName());
              u.setEmail(user.getEmail());
              u.setFirstName(user.getFirstName());
              u.setTelephone(user.getTelephone());
              u.setPassword(user.getPassword());
              
              em.persist(u);
              em.flush();
                          
          }
          
          catch(Exception e){
          
          log.log(Logger.Level.FATAL, "user has been added");
          
         throw new DataException("Data error!!!!");
      }  
           
          return resp;
          
      }
      
      static final Logger log = Logger.getLogger(DataUtil.class.getSimpleName());
    
}
