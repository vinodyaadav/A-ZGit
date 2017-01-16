/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.salaryIt;
import dao.salaryItDao;
import java.util.List;


public class salaryItServicesImpl implements salaryItServices {

    salaryItDao SalaryItDao;

    public void setSalaryItDao(salaryItDao SalaryItDao) {
        this.SalaryItDao = SalaryItDao;
    }

    public salaryItDao getSalaryItDao() {
        return SalaryItDao;
    }
    
    
    @Override
    public int addsalaryIt(salaryIt salaryIt) {
        return SalaryItDao.addsalaryIt(salaryIt);
    }

    @Override
    public int updatesalaryIt(salaryIt salaryIt) {
        return SalaryItDao.updatesalaryIt(salaryIt);
    }
    @Override
      public List  viewsalaryItDetailsCustName(String custName){
        return SalaryItDao.viewsalaryItDetailsCustName(custName);
    
      }
       @Override
      public List  viewsalaryItDetailsContactNo(String contactNo){
        return SalaryItDao.viewsalaryItDetailsContactNo(contactNo);
    
      }
      
      
      }               