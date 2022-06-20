package com.renee.mymovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renee.mymovie.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public int getCount() throws Exception{
		System.out.print("¼­ºñ½º");
		return userDao.count();
	}
}
