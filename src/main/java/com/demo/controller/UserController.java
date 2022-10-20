package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	private User getUser(@PathVariable("userId") Long userId) {
		//return this.userservice.getUsers(userId);
		User user= this.userservice.getUsers(userId);
		List contact = this.restTemplate.getForObject("http://localhost:8086/contact/user/"+user.getUserId(), List.class);
		user.setContact(contact);
		return user;
		
	}

}
