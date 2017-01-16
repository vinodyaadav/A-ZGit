/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.RationCard;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.RationcardDao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author M-Services
 */
public  class RationcardDaoImpl extends HibernateDaoSupport implements RationcardDao {

    private Object Rationcard;
   
    public int addRation(RationCard rationCard) {
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(rationCard);
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

    public int updateRation(RationCard rationCard) {
    return 0;
}

   public List viewRationCardDetailsCustomerName(String custName) {
        List RationCardList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           RationCardList=getHibernateTemplate().find("from RationCard where custName=?",custName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return RationCardList;
    }   
   
    
    

}
