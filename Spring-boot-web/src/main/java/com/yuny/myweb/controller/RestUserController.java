package com.yuny.myweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuny.myweb.model.User;

@RestController
@RequestMapping("/user1")
public class RestUserController {
	
	@RequestMapping("/{id}") 
	public User getUser(@PathVariable Integer id) {
		return new User(id,"张三",20,"中国广州");
	}
	
	
	@RequestMapping("/list") 
	public List<User> listUser() {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i <10; i++) {
			userList.add(new User(i,"张三"+i,20+i,"中国广州"));
		}
		
		return userList;
	}
}
