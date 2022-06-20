package com.renee.mymovie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private SqlSession session;
	private final String namespace = "com.renee.mymovie.dao.UserMapper.";
	
	public int count() throws Exception{
		System.out.print("´Ù¿À");
		return session.selectOne(namespace+"count");
	}
	
}
