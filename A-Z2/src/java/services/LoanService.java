/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.LoanModel;
import java.util.List;

/**
 *
 * @author Debuggerrr
 */
public interface LoanService {
     int addLoan(LoanModel loan);
    int updateLoan(LoanModel loan);
    List viewLoanDetailsByContactNo(String contact);

}
