package com.iiht.giftcard.dao;

import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.iiht.giftcard.model.GiftCard;
import com.iiht.giftcard.model.Order;

public class GiftCardOrderDaoSqlImpl implements GiftCardDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {    
	    this.template = template;    
	} 

	@Override
	public boolean addGiftOrder(Order order) {
	 int i= (Integer)template.save(order);   
		
		if(i>=1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Order> viewUndeliveredOrder() {
		List<Order> order=template.find("from Order where orderstatus='Out for delivery '");
		return order;
	}

	
	@Override
	public List<Order> viewGiftCardOrderHistory() {
		List<Order> order=template.find("from Order");
		return order;

	}

}
