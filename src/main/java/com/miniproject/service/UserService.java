package com.miniproject.service;
import java.util.List;
import com.miniproject.model.Users;
//import com.spring.mybatis.model.User;
//import com.spring.mybatis.model.User;
//
//import groovyjarjarantlr.collections.List;

public interface UserService {
	public List<Users> findAll();
	public boolean save(Users user);
	public boolean deleteByUserHash(String userHash);
	public boolean updateByUserHash(Users user);
	public boolean saveBatch(List<Users> users);
	
	
	
	
	
}

