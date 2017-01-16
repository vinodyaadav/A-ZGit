/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.PanCard;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PanCardService {
    
    int addPanCard(PanCard Pancard);
    int updatePanCard(PanCard Pancard);

  // public List viewPanCardDetailsContactNo(String contactNo);

      List viewPanCardDetailsCustomerName(String custName);
}
