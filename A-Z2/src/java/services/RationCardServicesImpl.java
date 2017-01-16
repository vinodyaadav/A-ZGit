/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.RationCard;

import dao.RationcardDao;
import java.util.List;
/**
 *
 * @author Admin
 */
public class RationCardServicesImpl implements RationCardService {

    RationcardDao rationcardDao;

    public void setRationcardDao(RationcardDao rationcardDao) {
        this.rationcardDao = rationcardDao;
    }

   

 
    @Override
    public int addRation(RationCard RationCard) {
        return rationcardDao.addRation(RationCard);
    }
    
    @Override
    public int updateRation(RationCard RationCard) {
        return rationcardDao.updateRation(RationCard);
    }

     
    @Override
    public List viewRationCardDetailsCustomerName(String custName)
    {
         return rationcardDao.viewRationCardDetailsCustomerName(custName);
    } 
    
}