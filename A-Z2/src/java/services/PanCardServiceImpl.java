/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.PanCard;

import dao.PanCardDao;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PanCardServiceImpl implements PanCardService{
  
    PanCardDao panCardDao;

    public void setPanCardDao(PanCardDao panCardDao) {
        this.panCardDao = panCardDao;
    }

   
    
    @Override
    public int addPanCard(PanCard Pancard) {
        return panCardDao.addPanCard(Pancard);
    }

    @Override
    public int updatePanCard(PanCard Pancard) {
        return panCardDao.updatePanCard(Pancard);
    }
    
    
    
    public List viewPanCardDetailsCustomerName(String custName)
    {
        return panCardDao.viewPanCardDetailsCustomerName(custName);
    } 
    
   
    
    
    
}
