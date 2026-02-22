package com.example.Users_Service.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.*;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.Users_Service.repository.*;
import com.example.Users_Service.model.*;
import com.example.Users_Service.repository.*;


@Service
public class UserJpaService implements UserServiceRepository {
	
	@Autowired
	public UserServiceJpaRepository userJpaRepository;
	public ArrayList<User> getUsers(){
		List<User> users=userJpaRepository.findAll();
		ArrayList<User> userList=new ArrayList<>(users);
		return userList;
		
	}
}	