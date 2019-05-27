package com.steins.dao;

import com.steins.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest{
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insertUser() {
	}
	
	@Test
	public void isExists() {
	}
	
	@Test
	public void getUser() {
		User u =new User();
		String username="1111";
		String password="1111";
		u.setUsername(username);
		u.setPassword(password);
		System.out.println(u);
		
		System.out.println(userDao.getUser(u));
	}
	
	@Test
	public void deleteUser() {
	}
	
	@Test
	public void insertUserInfo() {
	}
	
	@Test
	public void getIdentity() {
	}
}