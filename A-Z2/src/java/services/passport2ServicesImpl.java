/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import Model.passport2;
import dao.passport2Dao;


public class passport2ServicesImpl implements passport2Services {

    passport2Dao passport;

    public void setPassport(passport2Dao passport) {
        this.passport = passport;
    }

    public passport2Dao getPassport() {
        return passport;
    }
        
    @Override
    public int addPassport2(passport2 Passport2) {
        return passport.addPassport2(Passport2);
    }

    @Override
    public int updatePassport2(passport2 Passport2) {
        return passport.updatePassport2(Passport2);
    }

    /*public List viewPassport2(String loggedInUser) {
        return passportDao.viewPassport2(loggedInUser);
    }

    public List viewAllPassport2(String loggedInUser) {
        return passportDao.viewAllPassport2(loggedInUser);
    }

    public passport2 viewPassport2ById(int id,String loggedUser) {
        return passportDao.viewPassport2ById(id,loggedUser);
    }

   */

  
}
