/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.LoanModel;
import dao.LoanDao;
import java.util.List;

/**
 *
 * @author Debuggerrr
 */
public  class loanServicesImpl implements LoanService{
     LoanDao loDao;
      public void setloanDao(LoanDao loDao){
        this.loDao=loDao;
    }
    
    public int addLoan(LoanModel loan) {
        return loDao.addLoan(loan);
    }

 
    public int updateLoan(LoanModel loan) {
        return loDao.updateLoan(loan);
            }

    public List viewLoanDetailsByContactNo(String contact){
        return loDao.viewLoanDetailsByContactNo(contact);
    }
 

    }


  

