package com.example.Memory_Service.service;
import java.util.ArrayList;
import java.util.List;

import com.example.Memory_Service.model.Memory;
import com.example.Memory_Service.repository.*;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;


@Service
public class MemoryJpaService implements MemoryServiceRepository{
	@Autowired
	public MemoryServiceJpaRepository memoryServiceJpaRepository;
	public ArrayList<Memory> getMemories(){
		List<Memory> mems=memoryServiceJpaRepository.findAll();
		ArrayList<Memory> memlist=new ArrayList<>(mems);
		return memlist;
		
	}
}