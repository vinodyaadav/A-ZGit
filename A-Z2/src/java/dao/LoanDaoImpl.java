/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.LoanModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Debuggerrr
 */
public class LoanDaoImpl extends HibernateDaoSupport implements LoanDao {

    //@Override
   private Object loan;
   
   
    public int addLoan(LoanModel loan2) {
        Integer licenceid=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(loan2);
                licenceid=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e)
        {
            licenceid=0;
        }      
      return licenceid;
    }

    public int updateLoan(LoanModel loan2) {
    return 0;
    
}
    
      public List viewLoanDetailsByContactNo(String contact) {
        List loanList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           loanList=getHibernateTemplate().find("from LoanModel where contactNo=?",contact);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return loanList;
    }
}