package com.steins.service;

import com.steins.dao.BaseTest;
import com.steins.dao.UserDao;
import com.steins.entity.Store;
import com.steins.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseTest {
	@Autowired
	private UserService userService;
	@Test
	public void getUser() {
		User u =new User();
		String username="1111";
		String password="1111";
		u.setUsername(username);
		u.setPassword(password);
		System.out.println(userService.getUser(u));
		
	}
	@Test
	public void demo1(){
		List<Store> storeList =new ArrayList<>();
//		storeList=userService.

	}
}