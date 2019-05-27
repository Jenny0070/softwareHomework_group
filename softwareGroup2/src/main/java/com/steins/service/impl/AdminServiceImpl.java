package com.steins.service.impl;

import com.steins.dao.AdminDao;
import com.steins.entity.Comment;
import com.steins.entity.Food;
import com.steins.entity.Store;
import com.steins.entity.User;
import com.steins.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sunny
 */
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public boolean insertFood(Food food) {
		Integer flag = adminDao.insertFood(food);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean deleteFood(int foodId) {
		Integer flag = adminDao.deleteFood(foodId);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean updateFood(Food food) {
		Integer flag = adminDao.updateFood(food);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public Food queryOneFood(int foodId) {
		Food food = new Food();
		food = adminDao.queryOneFood(foodId);
		return food;
	}
	
	@Override
	public List<Food> queryFoodList() {
		List<Food> foods = new ArrayList<>();
		foods = adminDao.queryFoodList();
		return foods;
	}
	
	@Override
	public List<Food> queryOneStoreFoodList(int storeId) {
		List<Food> foods = new ArrayList<>();
		foods = adminDao.queryOneStoreFoodList(storeId);
		return foods;
	}
	
	@Override
	public boolean insertStore(Store store) {
		Integer flag = adminDao.insertStore(store);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean deleteStore(int storeId) {
		Integer flag = adminDao.deleteStore(storeId);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean updateStore(Store store) {
		Integer flag = adminDao.updateStore(store);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
	@Override
	public Store queryOneStore(int storeId){
		Store store=new Store();
		store=adminDao.queryOneStore(storeId);
		return  store;
	}

	@Override
	public List<Store> queryStoreList() {
		List<Store> storeList=new ArrayList<>();
		storeList=adminDao.queryStoreList();
		return storeList;
	}

	@Override
	public List<Comment> queryAllComment() {
		List<Comment> commentList=new ArrayList<>();
		commentList=adminDao.queryAllComment();
		return commentList;
	}

	@Override
	public boolean deleteComment(int commentId) {
		Integer flag = adminDao.deleteComment(commentId);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public List<User> queryAllUser() {
		List<User> userList=new ArrayList<>();
		userList =adminDao.queryAllUser();
		return  userList;

	}

	@Override
	public boolean deleteUser(int userId) {
		Integer flag = adminDao.deleteUser(userId);
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}
}
