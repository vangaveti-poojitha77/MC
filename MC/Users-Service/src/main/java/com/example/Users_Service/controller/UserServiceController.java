package com.example.Users_Service.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Users_Service.service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Users_Service.service.UserJpaService;
import com.example.Users_Service.model.User;

import java.util.*;

@RestController
@RequestMapping("/user")
class UserServiceControllerr{
	@Autowired
	public UserJpaService userJpaService;
	
	@GetMapping("/user")
	public ArrayList<User> getUsers() {
		return userJpaService.getUsers() ;
	}
	
} 