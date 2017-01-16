/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.licDao;
import Model.lic;
import java.util.List;

/**
 *
 * @author Mservices Demo
 */
public  class licServicesImpl implements licServices {

    licDao licDao;

    public void setLicDao(licDao licDao) {
        this.licDao = licDao;
    }

    @Override
    public int updateLic(lic Lic) {
        return licDao.updateLic(Lic);
    }
    
    
    public int addLic(lic Lic){
         return licDao.addLic(Lic);
    }
    
  
    public List viewlicDetailsMobileNo(String mobileNo){
        return licDao.viewlicDetailsMobileNo(mobileNo);
    }

   public List viewlicDetailsCustomerName(String customerName){
        return licDao.viewlicDetailsCustomerName(customerName);
    }
   
   
 public  List viewCustomerReport(String contactNo,String custName,String subDate,String serivceType)
 {
     return licDao.viewCustomerReport(contactNo, custName, subDate, serivceType);
 }
   
   
}
