/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.DrivingModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Debuggerrr
 */
public class drivingDaoImpl extends HibernateDaoSupport implements drivingDao{

    private Object driv;
    @Override
    public int addDriving(DrivingModel Drive) {
        Integer licenceid=0;
    
    try{
        getHibernateTemplate().save(Drive);
       
    }
    catch(Exception e)
            {
                licenceid=0;
            }
    return licenceid;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateDriving(DrivingModel Drive) {
         return 0;
    }

    public List viewDrivingDetailsByContact(String phoneNo){
    List drivingList=new ArrayList();
     try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
            //String sql="DELETE column firmname FROM FoodModel";
           drivingList=getHibernateTemplate().find("from DrivingModel where contactNo=?",phoneNo);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return drivingList;
    }
   
    
    
}
