package com.iiht.giftcard.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.iiht.giftcard.model.User;

public class LoginUserSqlImpl implements LoginUserDao {
	HibernateTemplate template;
	

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

public boolean loginUser(String user,String pass) {
	
	
		List<User> u=template.find("from User where name='"+user+"' and pass='"+pass+"'");
		if(u.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}

}
