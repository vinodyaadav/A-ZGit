/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.passport2;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mservices2
 */
public  class passport2DaoImpl extends  HibernateDaoSupport implements passport2Dao
{
private Object passport2;

   
  @Override
    public int addPassport2(passport2 Passport2) {

int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(Passport2);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e){
            id=0;
        }      
      return id;
    }

@Override
    public int updatePassport2(passport2 Passport2) {
        return 0;
    }
}
 
   
    
  

