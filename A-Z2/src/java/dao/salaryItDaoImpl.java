/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.salaryIt;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author M-Services
 */
public class salaryItDaoImpl extends HibernateDaoSupport implements salaryItDao {

    private Object salaryIt;
   
    public int addsalaryIt(salaryIt salaryIt) {
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(salaryIt);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e){
            id=0;
        }      
      return id;
    }

    public int updatesalaryIt(salaryIt salaryIt) {
    return 0;
}
    public List viewsalaryItDetailsCustName(String custName)
    {
        List salaryIt1=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           salaryIt1=getHibernateTemplate().find("from salaryIt where custName=?",custName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return salaryIt1;
    }
     public List viewsalaryItDetailsContactNo(String contactNo)
    {
        List salaryIt1=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           salaryIt1=getHibernateTemplate().find("from salaryIt where contactNo=?",contactNo);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return salaryIt1;
    }
}


