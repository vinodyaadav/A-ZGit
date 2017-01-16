/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.FoodModel;
import dao.foodDao;
import java.util.List;

/**
 *
 * @author Debuggerrr
 */
public class foodservicesImpl  implements foodServices{
    
    foodDao foodDao;

    public void setFoodDao(foodDao foodDao) {
        this.foodDao = foodDao;
    }

   

      @Override
    public int updatefoodlicence(FoodModel food) {
        return foodDao.updatefoodlicence(food);
    }
    
    
    public int addfoodlicence(FoodModel food){
         return foodDao.addfoodlicence(food);
    }
     public List viewfoodDetailCompany(String company){
        return foodDao.viewfoodDetailCompany(company);
    }
      public List viewfoodDetailPropertiorName(String name){
        return foodDao.viewfoodDetailPropertiorName(name);
    }
       public List viewfoodDetailContact(String contactno){
        return foodDao.viewfoodDetailContact(contactno);
    }
    
}
