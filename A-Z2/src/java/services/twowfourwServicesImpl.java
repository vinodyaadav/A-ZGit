/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.twowfourwh;

import dao.twowfourwDao;
import java.util.List;


/**
 *
 * @author Admin
 */
public class twowfourwServicesImpl implements twowfourwServices{
    
    twowfourwDao twowfourwDao;
   
    public void settwowfourwDao(twowfourwDao twowfourwDao) {
        this.twowfourwDao = twowfourwDao;
    }
   
   
     
    @Override
    public int addTwowfourw(twowfourwh twowfourwh){
         return twowfourwDao.addTwowfourw(twowfourwh);
    }
    @Override
    public int updateTwowfourw(twowfourwh twowfourwh) {
        return twowfourwDao.updateTwowfourw(twowfourwh);
        
        
        
        
    }
     
   @Override
    public List viewtwowfourwhDetailsCustomerName(String custName)
    {
         return twowfourwDao.viewtwowfourwhDetailsCustomerName(custName);
    } 
    
}
   

   
