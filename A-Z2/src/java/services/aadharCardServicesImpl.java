/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.aadharCard;
import dao.aadharCardDao;


public class aadharCardServicesImpl implements aadharCardServices {

    aadharCardDao aadharDao;

    public void setAadharDao(aadharCardDao aadharDao) {
        this.aadharDao = aadharDao;
    }

    public aadharCardDao getAadharDao() {
        return aadharDao;
    }
    
    
    @Override
    public int addAadharCard(aadharCard AadharCard) {
        return aadharDao.addAadharCard(AadharCard);
    }

    @Override
    public int updateAadharCard(aadharCard AadharCard) {
        return aadharDao.updateAadharCard(AadharCard);
    }

    /*public List viewAadharCard(String loggedInUser) {
        return aadharDao.viewAadharCard(loggedInUser);
    }

    public List viewAllAadharCard(String loggedInUser) {
        return aadharDao.viewAllAadharCard(loggedInUser);
    }

    public aadharCard viewAadharCardById(int id,String loggedUser) {
        return aadharDao.viewAadharCardById(id,loggedUser);
    }

   */

    @Override
    public int addAadharCard(int AadharCard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
