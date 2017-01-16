/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.PanCard;
import dao.PanCardDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Admin
 */
public class PanCardDaoImpl extends HibernateDaoSupport implements PanCardDao {
  private Object Pancard;
    private Object custName;
   
    public int addPanCard(PanCard pancard) {
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(pancard);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e){
            id=0;
        }      
      return id;
    }

    public int updatePanCard(PanCard pancard) {
    return 0;
}   
  public List viewPanCardDetailsCustomerName(String custName) {
        List PanCardList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           PanCardList=getHibernateTemplate().find("from PanCard where custName=?",custName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return PanCardList;
    }   
   
    
    
}
