/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.DrivingModel;
import java.util.List;

/**
 *
 * @author Debuggerrr
 */
public interface drivingDao {
    int addDriving(DrivingModel Drive);
    int updateDriving(DrivingModel Drive);
     List viewDrivingDetailsByContact(String phoneNo);
}
