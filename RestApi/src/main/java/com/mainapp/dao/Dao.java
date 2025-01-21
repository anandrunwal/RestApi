package com.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.Student;

@Repository
public interface Dao extends JpaRepository<Student,Integer>{

}
