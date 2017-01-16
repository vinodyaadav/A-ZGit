/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.mediclaimDao;
import Model.mediclaim;

/**
 *
 * @author Mservices Demo
 */
public  class mediclaimServicesImpl implements mediclaimServices {

    mediclaimDao MediclaimDao;

    public void setMediclaimDao(mediclaimDao MediclaimDao) {
        this.MediclaimDao = MediclaimDao;
    }

      @Override
    public int updatemediclaim(mediclaim Mediclaim) {
        return MediclaimDao.updatemediclaim(Mediclaim);
    }
    
    
    public int addmediclaim(mediclaim Mediclaim){
         return MediclaimDao.addmediclaim(Mediclaim);
    }
    
}
