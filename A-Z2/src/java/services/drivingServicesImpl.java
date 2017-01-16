/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.DrivingModel;
import dao.drivingDao;
import java.util.List;


/**
 *
 * @author Debuggerrr
 */
public class drivingServicesImpl implements drivingServices {
    drivingDao DrivingDao;

    public void setDrivingDao(drivingDao DrivingDao) {
        this.DrivingDao = DrivingDao;
    }

    public int updateDriving(DrivingModel Drive) {
        return DrivingDao.updateDriving(Drive);
    }
    
    
    public int addDriving(DrivingModel Drive){
         return DrivingDao.addDriving(Drive);
    }
    public List viewDrivingDetailsByContact(String phoneNo){
    return DrivingDao.viewDrivingDetailsByContact(phoneNo);
    }
    
}
