package com.iiht.giftcard.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iiht.giftcard.dao.LoginUserDao;
import com.iiht.giftcard.dao.LoginUserSqlImpl;
import com.iiht.giftcard.dao.RegisterUserDao;
import com.iiht.giftcard.dao.RegisterUserSqlImpl;
import com.iiht.giftcard.model.User;  
@Controller
public class LoginController {
	@Autowired    
    RegisterUserDao registerUser;//will inject dao from XML file
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("u") User u,Model m){
		
        boolean val= registerUser.registerUser(u);
        if(val) {
        	m.addAttribute("message", u.getName()+" Register Successfully,Now Login to Continue");
        	return "login"; 
        }
        else {
        
        	m.addAttribute("message", u.getName()+" Already exist please try another name");
		return "error";
        } 
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String loginUser(@RequestParam("name") String name,@RequestParam("pass") String pass,HttpServletRequest request,Model m){
		
        LoginUserDao loginUser=new LoginUserSqlImpl();
        boolean val= loginUser.loginUser(name,pass);
        if(val) {
        	HttpSession session=request.getSession();
        	return "home"; 
        }
        else {
        
        	m.addAttribute("message","Invalid Username or Password");
		return "error";
        } 
	}
}
