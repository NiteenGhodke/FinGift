package com.iiht.giftcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.giftcard.dao.GiftCardDao;
import com.iiht.giftcard.model.GiftCard;

@Controller
public class GiftCardHistoryController {
	@Autowired
	GiftCardDao giftCardDao;
	@RequestMapping(value="/vieworder",method = RequestMethod.GET)
	public String viewGiftCardOrderHistory(Model m){
		
			
		List<GiftCard> giftCard=giftCardDao.viewGiftCardOrderHistory();
        
        if(CollectionUtils.isEmpty(giftCard)) {
        	
        	m.addAttribute("message","Data Not Found");
        	return "error";
        }
        else {
        	m.addAttribute("giftcardlist", giftCard);
        
        	return "viewgiftcardorderhistroy";
        } 
		
	}

}
