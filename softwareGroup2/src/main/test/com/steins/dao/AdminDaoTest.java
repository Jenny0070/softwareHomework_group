package com.steins.dao;

import com.steins.entity.Comment;
import com.steins.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdminDaoTest extends BaseTest {
    @Autowired
    private AdminDao adminDao;
    @Test
    public void queryAllUser(){
        List<User> userList=new ArrayList<>();
        userList=adminDao.queryAllUser();
        System.out.println(userList);
    }
    @Test
    public void queryAllComment() {
        List<Comment> commentList=new ArrayList<>();
        commentList=adminDao.queryAllComment();
        System.out.println(commentList);
    }
}