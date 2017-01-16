/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.salaryIt;
import java.util.List;

/**
 *
 * @author M-Services
 */
public interface salaryItDao {
    
     int addsalaryIt(salaryIt SalaryIt);
    int updatesalaryIt(salaryIt SalaryIt);
    
    List viewsalaryItDetailsCustName(String CustName);
    List viewsalaryItDetailsContactNo(String contactNo);
    
  /* List viewAadharCard(String loggedInUser);
   List viewAllAadharCard(String loggedInUser);
   salaryIt viewAadharCardById(int id,String loggedUser);
    */
    
}
