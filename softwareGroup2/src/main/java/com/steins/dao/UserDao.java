package com.steins.dao;


import com.steins.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  {
	
	//注册添加用户,只有普通用户需要注册
//
//	Integer insertUser(User user);
//
//	//查看用户是否存在——保持用户名唯一性
//
//	Integer isExists(User user);
	
	//登录
	
	Integer getUser(User user);
	
//	完善个人信息页面先删除后插入
//	Integer deleteUser(User user);
//
//	Integer insertUserInfo(User user);
//
//
////	获取身份
//	Integer getIdentity(User user);
	
}
