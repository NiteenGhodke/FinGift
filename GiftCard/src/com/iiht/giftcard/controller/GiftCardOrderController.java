package com.iiht.giftcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.giftcard.dao.GiftCardDao;
import com.iiht.giftcard.model.Order;

@Controller
public class GiftCardOrderController {
	@Autowired    
    GiftCardDao placeOrder;//will inject dao from XML file
	@RequestMapping(value="/order",method = RequestMethod.POST)
	public String addGiftOrder(@ModelAttribute("order") Order order){
		
        boolean val= placeOrder.addGiftOrder(order);
        if(val) {
        	
        	return "order"; 
        }
        else {
        
        	return "error";
        } 
	}

}
