package com.store.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.store.dao.UserDao;
import com.store.entity.User;

@Component
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public String getUser(String str) {
		// TODO Auto-generated method stub
	//	return userDao.getUser(str);
		return "aaa";
	}

}
