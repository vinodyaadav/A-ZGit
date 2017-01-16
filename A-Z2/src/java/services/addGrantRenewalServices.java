/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.addGrantRenewal;
import java.util.List;
/**
 *
 * @author Mservices Demo
 */
public interface addGrantRenewalServices {
    
    int addaddgrantrenewal(addGrantRenewal grantrenewal);
    int updategrantrenewal(addGrantRenewal grantrenewal);
    
    
      List viewgrantrenewalDetailsCustomerName(String customerName);

}
