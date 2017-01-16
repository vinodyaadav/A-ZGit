/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.salaryIt;
import java.util.List;

/**
 *
 * @author M-Services
 */
public interface salaryItServices {
    
    int addsalaryIt(salaryIt salaryIt);
    int updatesalaryIt(salaryIt salaryIt);
    
    List viewsalaryItDetailsCustName(String CustName);
   List viewsalaryItDetailsContactNo(String contactNo);
  /* List viewsalaryIt(String loggedInUser);
   List viewAllsalaryIt(String loggedInUser);
   salaryIt viewsalaryItById(int id,String loggedUser);
   */ 

    
}
