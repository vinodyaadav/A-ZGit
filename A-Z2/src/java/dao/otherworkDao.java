/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.otherwork;
import java.util.List;
/**
 *
 * @author Mservices Demo
 */
public interface otherworkDao {
    
    int addOtherwork(otherwork Otherwork);
    int updateOtherwork(otherwork Otherwork);
    
List viewotherworkDetailsCustomerName(String customerName);    
}
