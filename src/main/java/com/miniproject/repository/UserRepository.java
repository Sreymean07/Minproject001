package com.miniproject.repository;
import java.util.List;


import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

import com.miniproject.model.Users;


@Repository
public interface UserRepository {
	@Select("SELECT * from users"		
	)		
	public List<Users> findAll();
	
	


	
}
