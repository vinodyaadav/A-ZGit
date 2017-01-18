/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Model.mediclaim;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Samrudhi
 */
public class mediclaimDaoImpl extends HibernateDaoSupport implements mediclaimDao {
    
    private Object mediclaim;
    
    public  int addmediclaim(mediclaim Mediclaim){
    Integer id=0;
    
    try{
        getHibernateTemplate().save(Mediclaim);
       id=1;
    }
    catch(Exception e)
    {
        id=0;
    }
    return id;
    }
    
    
    
    
    @Override
    public int updatemediclaim(mediclaim Mediclaim){
    return 0;
    }
}
