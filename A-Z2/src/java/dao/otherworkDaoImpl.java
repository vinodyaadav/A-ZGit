/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.otherwork;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mservices Demo
 */
public class otherworkDaoImpl extends HibernateDaoSupport implements otherworkDao{
    
    private Object otherwork;
    
    public int addOtherwork(otherwork Otherwork){
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(Otherwork);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e){
            id=0;
        }      
      return id;
    }

    public int updateOtherwork(otherwork Otherwork) {
    return 0;
}

    
 
    public  List viewotherworkDetailsCustomerName(String customerName) {
        List otherworkList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           otherworkList=getHibernateTemplate().find("from otherwork where custName=?",customerName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return otherworkList;
    }

}
