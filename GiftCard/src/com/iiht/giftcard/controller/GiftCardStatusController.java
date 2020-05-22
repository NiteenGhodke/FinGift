package com.iiht.giftcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.giftcard.dao.GiftCardDao;
import com.iiht.giftcard.model.Order;


@Controller
public class GiftCardStatusController {
	@Autowired    
    GiftCardDao viewUndeliveredOrder;//will inject dao from XML file
	@RequestMapping(value="/order",method = RequestMethod.POST)
	public String viewUndeliveredOrder(Model m){
		
        List<Order> orderList=viewUndeliveredOrder.viewUndeliveredOrder();
if(CollectionUtils.isEmpty(orderList)) {
        	
        	m.addAttribute("message","Data Not Found");
        	return "error";
        }
        else {
        	m.addAttribute("undeliveredOrderList", orderList);
        
        	return "viewundeliveredorder";
        } 
	}

}
