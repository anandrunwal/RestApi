package com.mainapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mainapp.dao.Dao;
import com.mainapp.entity.Student;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;

	public void insert(Student std) {
		dao.save(std);
	}

	public List<Student> read() {
		
		return dao.findAll();
	}

	public Optional<Student> readsingle(int id) {
		
		return dao.findById(id);
	}

	public void delete(int id) {
		
		dao.deleteById(id);
	}
}
