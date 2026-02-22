package com.example.Memory_Service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.*;

import com.example.Memory_Service.model.Memory;
import com.example.Memory_Service.service.MemoryJpaService;

@RestController
@RequestMapping("/memory")
public class MemoryServiceController{
	
	@Autowired
	public MemoryJpaService memoryJpaService;
	@GetMapping("/memory")
	public ArrayList<Memory> getMemories(){
		return memoryJpaService.getMemories();
	}
	 
	
}