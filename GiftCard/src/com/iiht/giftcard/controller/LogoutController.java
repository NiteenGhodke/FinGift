package com.iiht.giftcard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.giftcard.dao.GiftCardDao;
import com.iiht.giftcard.dao.LogoutDao;
import com.iiht.giftcard.model.GiftCard;

@Controller
public class LogoutController {
	@Autowired
	LogoutDao out;
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request,HttpServletResponse response,Model m){
		boolean value=out.logout(request);
		
		return "login";
		
        
	}

}
