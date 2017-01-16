

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.twowfourwh;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Admin
 */
public class twowfourwDaoImpl extends HibernateDaoSupport implements twowfourwDao{
    
    private Object twowfourw;
   
    @Override
    public int addTwowfourw(twowfourwh twowfourwh) {
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(twowfourwh);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e)
        {
            id=0;
        }      
      return id;
    }

    public int updateTwowfourw(twowfourwh twowfourwh) {
    return 0;
}
     public List viewtwowfourwhDetailsCustomerName(String custName) {
        List twowfourwhList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           twowfourwhList=getHibernateTemplate().find("from twowfourwh where custName=?",custName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return twowfourwhList;
    }   
   
    }


