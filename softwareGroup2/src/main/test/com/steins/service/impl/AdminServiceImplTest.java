package com.steins.service.impl;

import com.steins.dao.AdminDao;
import com.steins.dao.BaseTest;
import com.steins.entity.Comment;
import com.steins.entity.Food;
import com.steins.entity.Store;
import com.steins.entity.User;
import com.steins.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdminServiceImplTest extends BaseTest {
	@Autowired
	private AdminService adminService;
	@Test
	public void insertFood() {
		Food food=new Food();
		food.setFoodName("鸡公煲");
		food.setFoodDesc("重庆");
		food.setStoreId(1);
		boolean flag=adminService.insertFood(food);
		System.out.println(flag);
		
	}
	
	@Test
	public void deleteFood() {
		boolean flag=adminService.deleteFood(1);
		System.out.println(flag);
	}
	
	@Test
	public void updateFood() {
		Food food=new Food();
		food.setFoodId(2);
		food.setFoodName("鸡公煲1");
		food.setFoodDesc("重庆1");
		food.setStoreId(2);
		boolean flag=adminService.updateFood(food);
		System.out.println(flag);
	}
	
	@Test
	public void queryOneFood() {
		Food food=new Food();
		food=adminService.queryOneFood(2);
		System.out.println(food);
	}
	
	@Test
	public void queryFoodList() {
		List<Food> list=new ArrayList<>();
		list=adminService.queryFoodList();
		System.out.println(list);
	}
	
	@Test
	public void queryOneStoreFoodList() {
		List<Food> list=new ArrayList<>();
		list=adminService.queryOneStoreFoodList(1);
		System.out.println(list);
	}
	
	@Test
	public void insertStore() {
		Store store=new Store();
		store.setStoreName("重庆鸡公煲");
		store.setStoreDesc("鸡公煲+排骨");
		store.setStoreScore(80);
		store.setStoreRanking(1);
		store.setStoreTel("123456");
		boolean flag=adminService.insertStore(store);
		System.out.println(flag);
	}
	
	@Test
	public void deleteStore() {
		boolean flag=adminService.deleteStore(2);
		System.out.println(flag);
	}
	
	@Test
	public void updateStore() {
		Store store=new Store();
		store.setStoreId(2);
		store.setStoreName("重庆鸡公煲1");
		store.setStoreDesc("鸡公煲+排骨1");
		store.setStoreScore(90);
		store.setStoreRanking(2);
		store.setStoreTel("12345246");
		boolean flag=adminService.updateStore(store);
		System.out.println(flag);
	}
	
	@Test
	public void queryOneStore() {
		Store store=new Store();
		store=adminService.queryOneStore(1);
		System.out.println(store);
	}
	@Test
	public void queryStoreList(){
		List<Store> storeList=new ArrayList<>();
		storeList=adminService.queryStoreList();
		System.out.println(storeList);
	}
	@Test
	public void  queryAllUser(){
		List<User> userList=new ArrayList<>();
		userList=adminService.queryAllUser();
		System.out.println(userList);
	}
	@Test
	public void  queryAllComment(){
		List<Comment> commentList=new ArrayList<>();
		commentList=adminService.queryAllComment();
		System.out.println(commentList);

	}
}