/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.aadharCard;

/**
 *
 * @author M-Services
 */
public interface aadharCardServices {
    
    int addAadharCard(aadharCard AadharCard);
    int updateAadharCard(aadharCard AadharCard);
  /* List viewAadharCard(String loggedInUser);
   List viewAllAadharCard(String loggedInUser);
   aadharCard viewAadharCardById(int id,String loggedUser);
   */ 

    public int addAadharCard(int AadharCard);
}
