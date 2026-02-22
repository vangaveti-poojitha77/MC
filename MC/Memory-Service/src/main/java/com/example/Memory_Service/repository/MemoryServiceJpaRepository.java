package com.example.Memory_Service.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Memory_Service.model.Memory;

public interface MemoryServiceJpaRepository extends JpaRepository<Memory,Integer>{
	
}