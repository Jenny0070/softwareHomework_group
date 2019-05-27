package com.steins.dao;

import com.steins.entity.Comment;
import com.steins.entity.Food;
import com.steins.entity.Store;
import com.steins.entity.User;

import java.util.List;

/**
 * @author Sunny
 */
public interface AdminDao {
//	食物
	Integer insertFood(Food food);
	Integer deleteFood(int foodId);
	Integer updateFood(Food food);
	Food queryOneFood(int foodId);
	List<Food> queryFoodList();
	List<Food> queryOneStoreFoodList(int storeId);
//	店铺
	Integer insertStore(Store store);
	Integer deleteStore(int storeId);
	Integer updateStore(Store store);
	Store queryOneStore(int storeId);
	List<Store> queryStoreList();
//	评分
	List<Comment> queryAllComment();
	Integer deleteComment(int commentId);
//	用户
	List<User> queryAllUser();
	Integer deleteUser(int userId);
	
}
