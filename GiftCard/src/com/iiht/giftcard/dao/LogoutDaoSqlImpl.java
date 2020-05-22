package com.iiht.giftcard.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutDaoSqlImpl implements LogoutDao {


	@Override
	public boolean logout(HttpServletRequest request) {
		// TODO Auto-generated method stub
	HttpSession session =request.getSession();
	session.invalidate();
	return true;
		
	}
	



}
