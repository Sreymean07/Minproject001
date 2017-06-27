package com.miniproject.service;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Service;

import com.miniproject.model.Users;
import com.miniproject.repository.UserRepository;


@Service
public class UserServiceImp implements UserService{
private UserRepository  userRepository;

@Autowired
public UserServiceImp(UserRepository userRepository) {
	this.userRepository=  userRepository;	
	}
	
	@Override
	public List<Users> findAll() {
	
		return userRepository.findAll();
		
	}

	@Override
	public boolean save(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByUserHash(String userHash) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByUserHash(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveBatch(List<Users> users) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	
	
	

	

}
