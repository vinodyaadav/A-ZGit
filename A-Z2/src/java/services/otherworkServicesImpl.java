/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.otherworkDao;
import Model.otherwork;
import java.util.List;

/**
 *
 * @author Mservices Demo
 */
public class otherworkServicesImpl implements otherworkServices{
    
    otherworkDao otherworkDao;
    
    public void setOtherworkDao(otherworkDao otherworkDao) {
        this.otherworkDao = otherworkDao;
    }

   public int updateOtherwork(otherwork Otherwork) {
        return otherworkDao.updateOtherwork(Otherwork);
    }
    
    
    public int addOtherwork(otherwork Otherwork){
         return otherworkDao.addOtherwork(Otherwork);
    }
    
    public List viewotherworkDetailsCustomerName(String customerName){
        return otherworkDao.viewotherworkDetailsCustomerName(customerName);
    }
    
      
}
