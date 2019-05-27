package com.steins.controller;

import com.steins.entity.User;
import com.steins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.util.Password;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login" ,method = RequestMethod.POST)
	@ResponseBody
	
	public String login(HttpServletRequest request, @RequestParam("username") String username , @RequestParam("password")String password){
		User  user=new User();
		user.setUsername(username);
		user.setPassword(password);
		System.out.println(user);
		boolean flag =userService.getUser(user);
		if (flag){
			return "success";
		}
		else {
			return "fail";
		}
		
	}
}
