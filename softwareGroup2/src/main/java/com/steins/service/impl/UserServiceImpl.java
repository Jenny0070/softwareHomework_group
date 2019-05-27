package com.steins.service.impl;

import com.steins.dao.UserDao;
import com.steins.entity.User;
import com.steins.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Sunny
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	
	//登录
	@Override
	public boolean getUser(User user){
		System.out.println(userDao);
		Integer flag=userDao.getUser(user);
		try {
			if (flag.equals("")||flag==null){
				return false;
			}
			else{
				return true;
			}
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		
		
	}
//	//注册
//	@Override
//	public String insertUser(User user) {
//		Integer exsitFlag = userDao.isExists(user);
//		int insertFlag;
//		if (exsitFlag == null) {
//			insertFlag = userDao.insertUser(user);
//
//			if (insertFlag > 0) {
//				return "注册成功";
//			} else {
//				return "注册失败";
//			}
//
//
//		}
		
//		else {
//			return "用户名重复";
//		}
//
		
		
//	}
}
