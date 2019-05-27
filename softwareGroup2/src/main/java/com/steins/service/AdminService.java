package com.steins.service;

import com.steins.entity.Comment;
import com.steins.entity.Food;
import com.steins.entity.Store;
import com.steins.entity.User;

import java.util.List;

public interface AdminService {
	boolean insertFood(Food food);
	
	boolean deleteFood(int foodId);
	
	boolean updateFood(Food food);
	
	Food queryOneFood(int foodId);
	
	List<Food> queryFoodList();
	
	List<Food> queryOneStoreFoodList(int storeId);
	
	boolean insertStore(Store store);
	
	boolean deleteStore(int storeId);
	
	boolean updateStore(Store store);
	
	Store queryOneStore(int storeId);

	List<Store> queryStoreList();

	//	评分
	List<Comment> queryAllComment();
	boolean deleteComment(int commentId);
	//	用户
	List<User> queryAllUser();

	boolean deleteUser(int userId);
}
