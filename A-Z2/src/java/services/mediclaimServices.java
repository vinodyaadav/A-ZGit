/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;


import Model.mediclaim;

/**
 *
 * @author Samrudhi
 */
public interface mediclaimServices {
    
    int addmediclaim(mediclaim Mediclaim);
    int updatemediclaim(mediclaim Mediclaim);
    
}
