/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.FoodModel;
import java.util.List;

/**
 *
 * @author Debuggerrr
 */
public interface foodServices {
    
    int addfoodlicence(FoodModel food);
    int updatefoodlicence(FoodModel food);
    List viewfoodDetailCompany(String company);
    List viewfoodDetailContact(String contactno);
    List viewfoodDetailPropertiorName(String name);
    
}
