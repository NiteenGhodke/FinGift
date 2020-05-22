package com.iiht.giftcard.dao;
import java.util.List;

import com.iiht.giftcard.model.GiftCard;
import com.iiht.giftcard.model.Order;
public interface GiftCardDao {

	public List<Order> viewGiftCardOrderHistory() ;
	public boolean addGiftOrder(Order order);
	public List<Order> viewUndeliveredOrder();


	
}
