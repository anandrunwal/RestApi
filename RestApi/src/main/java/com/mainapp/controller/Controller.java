package com.mainapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.entity.Student;
import com.mainapp.service.Service;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Student std)
	{
		service.insert(std);
		return "Data Inserted Successfully";
	}
	
	@GetMapping("/reads")
	public List<Student> read()
	{
		return service.read();
	}
	
	@GetMapping("/read/{id}")
	public Optional<Student> readsingle(@PathVariable int id)
	{
		return service.readsingle(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.delete(id);
		return "Deleted Success";
	}
}
