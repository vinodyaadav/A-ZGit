/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.PanCard;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PanCardDao {
    
    int addPanCard(PanCard Pancard);
    int updatePanCard(PanCard Pancard);
    
    
    
    List viewPanCardDetailsCustomerName(String custName);




}
