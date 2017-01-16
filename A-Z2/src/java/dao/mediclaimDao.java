/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.mediclaim;

/**
 *
 * @author Samrudhi
 */
public interface mediclaimDao {
    
     int addmediclaim(mediclaim Mediclaim);
    int updatemediclaim(mediclaim Mediclaim);
    
}
