/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.twowfourwh;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface twowfourwDao {
    
    int addTwowfourw(twowfourwh twowfourwh);
    int updateTwowfourw(twowfourwh twowfourwh);
    
    
   
List viewtwowfourwhDetailsCustomerName(String custName);   

   
}
