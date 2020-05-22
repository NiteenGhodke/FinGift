package com.iiht.giftcard.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.iiht.giftcard.model.User;

public class RegisterUserSqlImpl implements RegisterUserDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {    
	    this.template = template;    
	} 
	public boolean registerUser(User u) {
		   
	    int i=(Integer) template.save(u);   
		
		if(i>=1) {
			return true;
		}
		else {
			return false;
		}
	}
	    
    
	   
   

}
