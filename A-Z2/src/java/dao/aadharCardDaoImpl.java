/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.aadharCard;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author M-Services
 */
public class aadharCardDaoImpl extends HibernateDaoSupport implements aadharCardDao {

    private Object aadharCard;
   
    public int addAadharCard(aadharCard AadharCard) {
        int id=0;
        try{
           // synchronized(this){
                getHibernateTemplate().save(AadharCard);
                id=1;
            //    PassPortId=PassPort.PassPortId();
           // }
        }
        catch(Exception e){
            id=0;
        }      
      return id;
    }

    public int updateAadharCard(aadharCard AadharCard) {
    return 0;
}
}
