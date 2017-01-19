/*
 * To change this license header, choose Gumastaense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.gumasta;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 *
 * @author RAKHI
 */
public class gumastaDaoImpl  extends HibernateDaoSupport implements gumastaDao {
     
    private Object Gumasta;
    
    public  int addGumasta(gumasta gumasta){
    Integer id=0;
    
    try{
        getHibernateTemplate().save(gumasta);
        id=1;
       
    }    catch(Exception e){
        id=0;
    }
    return id;
    }

     @Override
    public int updateGumasta(gumasta gumasta){
    return 0;
    
   
    
    }
    public List viewgumastaDetailsCustName(String custName)
    {
        List gumasta=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           gumasta=getHibernateTemplate().find("from gumasta where custName=?",custName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return gumasta;
    }
     public List viewgumastaDetailsContactNo(String contactNo)
    {
        List gumasta=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           gumasta=getHibernateTemplate().find("from gumasta where contactNo=?",contactNo);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return gumasta;
    }
}
