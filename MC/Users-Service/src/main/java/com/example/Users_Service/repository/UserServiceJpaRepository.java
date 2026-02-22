package com.example.Users_Service.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Users_Service.model.*;
import org.springframework.stereotype.*;

@Repository
public interface UserServiceJpaRepository extends JpaRepository<User,Integer>{
	
}