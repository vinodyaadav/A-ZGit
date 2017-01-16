/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.FoodModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Debuggerrr
 */
public class foodDaoImpl extends HibernateDaoSupport implements foodDao{
    
    private Object food;
    
    public  int addfoodlicence(FoodModel food1){
    Integer licenceid=0;
    
    try
    {
        getHibernateTemplate().save(food1);
       
    }
    catch(Exception e)
            {
                licenceid=0;
            }
    return licenceid;
    }
    
    
    
    
    @Override
    public int updatefoodlicence(FoodModel food1){
    return 0;
    }
    public List viewfoodDetailCompany(String company) {
        List foodList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
            String sql="DELETE column firmname FROM FoodModel";
           foodList=getHibernateTemplate().find("from FoodModel where firm=?",company);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return foodList;
    }
    public List viewfoodDetailPropertiorName(String name){
       List foodList=new ArrayList();
       try{
         foodList=getHibernateTemplate().find("from FoodModel where prop=?", name);
       }
       catch(Exception e){
       
       }
       return foodList;
    }
       public List viewfoodDetailContact(String contactno){
       List foodList=new ArrayList();
       try{
         foodList=getHibernateTemplate().find("from FoodModel where contactNo=?", contactno);
       }
       catch(Exception e){
       
       }
       return foodList;
    }
}
