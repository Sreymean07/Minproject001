package com.miniproject.controller;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.Users;
import com.miniproject.service.UserService;
//import com.spring.mybatis.model.User;

//import groovyjarjarantlr.collections.List;

@RestController

public class UserResController {
	
	private UserService userservice;
		
	@Autowired
	public UserResController(UserService userservice){
		this.userservice=userservice;
		
	}
	@RequestMapping
	public List<Users> findAll(){
		return userservice.findAll();
	
		
	}
//	@RequestMapping("/about")
//	public String usercu(ModelMap model){
//		
//		model.addAttribute("USER", new Users());
//		return "about";
//	}
//	
}
