/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.addGrantRenewal;
import dao.addGrantRenewalDao;
import java.util.List;

/**
 *
 * @author Mservices Demo
 */
public class addGrantRenewalServicesImpl implements addGrantRenewalServices
{
    
    addGrantRenewalDao addGrantRenewalDao;

    public void setAddGrantRenewalDao(addGrantRenewalDao addGrantRenewalDao) {
        this.addGrantRenewalDao = addGrantRenewalDao;
    }

    
 @Override
    public int updategrantrenewal(addGrantRenewal addGrantRenewal) {
        return addGrantRenewalDao.updategrantrenewal(addGrantRenewal);
    }
    
 
    public int addaddgrantrenewal(addGrantRenewal addGrantRenewal){
         return addGrantRenewalDao.addaddgrantrenewal(addGrantRenewal);
    }

    
 public List viewgrantrenewalDetailsCustomerName(String customerName){
        return addGrantRenewalDao.viewgrantrenewalDetailsCustomerName(customerName);
    }
 
 
    
}
