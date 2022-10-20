package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(new User(22L,"Ram","789765544"),
			new User(23L,"Raj","2789765544"),
			new User(24L,"Ajit","3789765544"),
			new User(25L,"Mohan","9789765544"),
			new User(26L,"Sheeta","9789765544"));

	@Override
	public User getUsers(Long id) {
		// TODO Auto-generated method stub
		//return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);			
	}

}
