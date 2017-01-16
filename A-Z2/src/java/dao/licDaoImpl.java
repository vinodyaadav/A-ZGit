/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.lic;
import Model.CustReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mservices Demo
 */
public  class licDaoImpl extends HibernateDaoSupport implements licDao{
    
    private Object Lic;
    
    public  int addLic(lic Lic){
    Integer id=0;
    
    try{
        getHibernateTemplate().save(Lic);
        id=1;
       
    }    catch(Exception e){
        id=0;
    }
    return id;
    }
    
    
    
    
    @Override
    public int updateLic(lic Lic){
    return 0;
    }
    
    
    
    
    
    public  List viewCustomerReport(String contactNo,String custName,String subDate,String serivceType)
 {  List custDetailsList=new ArrayList();
     List licList=new ArrayList();
     CustReport custReport=null;
       try{
            
            String sql="";
            
            sql="select custName,contactNo,address,decidedAmt,amtPaid,balAmt from "+serivceType+" where  ";
            if(contactNo!=""){
                
             sql=sql + "contactNo = '"+contactNo+"' ";
             }
             if(custName!=""){
                 if(contactNo!=""){
                
             sql=sql + " and custName = '"+custName+"' ";
             }
                 else{ sql=sql + "  custName = '"+custName+"' ";}
                     
            }
            if(subDate!=""){
                if(contactNo!=""||custName!=""){
                
             sql=sql + " and subDate = '"+subDate+"' ";
             }
                else{
                    sql=sql + "  subDate = '"+subDate+"' ";
                }
                }
           
            
              licList=getHibernateTemplate().find(sql);
              
              
              if(licList.size()>0){
                Iterator is=licList.iterator();
                while(is.hasNext()){
                    Object[] row =(Object[]) is.next();
                    //studentReport=new StudentReport(Integer.parseInt(row[0].toString()),row[1].toString(),row[2].toString(),Integer.parseInt(row[3].toString()),row[4].toString(),Integer.parseInt(row[5].toString()),row[6].toString(),Integer.parseInt(row[7].toString()),row[8].toString(),Integer.parseInt(row[9].toString()),row[10].toString(),Integer.parseInt(row[11].toString()),row[12].toString(),Integer.parseInt(row[13].toString()),row[14].toString(),Integer.parseInt(row[15].toString()),row[16].toString(),row[17].toString(),row[18].toString(),row[19].toString());
                    custReport=new CustReport(row[0].toString(),row[1].toString(),row[2].toString(),Integer.parseInt(row[3].toString()),Integer.parseInt(row[4].toString()),Integer.parseInt(row[5].toString()));
                    custDetailsList.add(custReport);
                }
            }
//              Query query=getSession().createQuery(sql);
//              licList=query.list();
          
//                sql="select s.personalId,coalesce(s.enrolmentNo,'--'),s.fullName ,c.ciId,c.ciName,c.ciNameCode,d.disciplineId,d.disciplineName,d.disciplineCode,p.programId,p.programName from CI c,Discipline d,User u,Program p,";
//                sql=sql+"StudentDetails s where c.ciId=s.ciId and d.disciplineId=s.disId and p.programId=s.programId ";
////                if(ciId>0){
//                    sql=sql + " and c.ciId="+ciId+" ";
//                }
//                if(ciId==0){
//                  sql=sql+   "and c.ciId IN (select ciId from ADCIMapping where userId="+userId+")";
//                }
//                if(disId>0){
//                    sql=sql + "and d.disciplineId="+disId+" ";
//                }
//                if(programId>0){
//                    sql=sql + "and p.programId="+programId+" ";
//                }
//                if(!enrolNo.equals("")){    
//                    sql=sql + "and s.enrolmentNo like '%"+enrolNo+"%'" ;
//                }
//                
//                if(!academicYear.equals("")){
//                    sql=sql + "and s.academicYear='"+academicYear+ "' ";
//                }
//                   if(!fileNumber.equals("")){
//                    sql=sql + "and s.fileNo='"+fileNumber+ "' ";
//                }
//                   if(!fullName.equals("")){
//                    sql=sql + "and s.fullName like '%"+fullName+"%'";
//                }
//            /*    if(!fileNumber.equals("")){
//                    sql=sql + "and s.fileNumber='"+fileNumber+ "' ";
//                }*/
//                sql=sql+" and  u.userId=s.userId and u.status='Active' order by s.fullName";
//                Query query=getSession().createQuery(sql);
//                query.setFirstResult((int) (offset!=0?offset:0));
//                query.setMaxResults((int) (maxResult!=0?maxResult:25));
//                studentList=query.list();
//            
//            
//            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
//           // String sql="from Faculty order by facultyName";
//            //System.out.println("Sql is :"+sql);enrolNo=?"
           //licList=getHibernateTemplate().find("from lic where ismn=?",contactNo);
               }catch(Exception e){
        }
        return custDetailsList; 
 }
    
      

      public List viewlicDetailsMobileNo(String mobileNo) {
        List licList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           licList=getHibernateTemplate().find("from lic where iscontactNo=?",mobileNo);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return licList;
    }
    
    public List viewlicDetailsCustomerName(String customerName) {
        List licList=new ArrayList();
        try{
            //String sql="from Faculty where facultyName like '"+facultyName+"%' order by facultyName";
           // String sql="from Faculty order by facultyName";
            //System.out.println("Sql is :"+sql);enrolNo=?"
           licList=getHibernateTemplate().find("from lic where iscustName=?",customerName);
            //facultyList=getHibernateTemplate().find(" from Faculty order by facultyName");
        }catch(Exception e){
        }
        return licList;
    }
}
