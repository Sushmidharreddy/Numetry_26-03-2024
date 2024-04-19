package com.uniqueid.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniqueid.www.model.UniqueIdModel;
import com.uniqueid.www.repo.UniqueIdRepository;

@RestController
@RequestMapping("/uniqueId")
public class UniqueIdController 
{
	@Autowired
	UniqueIdRepository repo;
	
	@GetMapping("/get")
	public List<UniqueIdModel> getDetails()
	{
		return (List<UniqueIdModel>) repo.findAll();
		
	}
	
	@PostMapping("/create")
	public String PostDetails(@RequestBody UniqueIdModel model)
	{
		repo.save(model); 
		return "Registration Done!";
	}
	
}
