package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DemoDetailes;
import com.example.demo.repositories.DemoRepositories;
@RestController

@RequestMapping("/nikhita")
public class DemoController {
@Autowired
	private DemoRepositories DemoRepo;
	@GetMapping
	public List<DemoDetailes> getAllDemos()
	{
		List<DemoDetailes> Demos=DemoRepo.findAll();
		return Demos ;
	}
	@PostMapping
        public void saveDemos(@RequestBody DemoDetailes Demos) {
	            DemoRepo.save(Demos);
  }
	@PutMapping
	
        public void updateDemo(@RequestBody DemoDetailes Demos) {
           DemoRepo.save(Demos);
	}
	
	@DeleteMapping("/Delete/{roll_no}")
	public void deleteDemos(@PathVariable long roll_no)
	{
		DemoRepo.deleteById(roll_no);
		
		
	
	}
	
	
	
	
}
