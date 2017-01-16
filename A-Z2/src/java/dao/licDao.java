/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.lic;
import java.util.List;

/**
 *
 * @author Mservices Demo
 */
public interface licDao {
    
   int addLic(lic Lic);
    int updateLic(lic Lic);
   
  List viewlicDetailsMobileNo(String mobileNo);
    
  List viewlicDetailsCustomerName(String customerName);  
  List viewCustomerReport(String contactNo,String custName,String subDate,String serivceType);
    
  
}
