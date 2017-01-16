/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.RationCard;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface RationCardService {
    
    int addRation(RationCard RationCard);
    int updateRation(RationCard RationCard);
    
  List viewRationCardDetailsCustomerName(String custName);   
}
