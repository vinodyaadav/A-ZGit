/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.gumasta;
import dao.gumastaDao;

/**
 *
 * @author RAKHI
 */
public  class gumastaServicesImpl implements gumastaServices {
    gumastaDao gumastaDao;

    public void setGumastaDao(gumastaDao gumastaDao) {
        this.gumastaDao = gumastaDao;
    }
    
    public gumastaDao getGumastaDao() {
        return gumastaDao;
    }
    @Override
                public int updateGumasta(gumasta gumasta) {
        return gumastaDao.updateGumasta(gumasta);
    }
    @Override
                public int addGumasta(gumasta gumasta){
         return gumastaDao.addGumasta(gumasta);
    }
    
    
}
