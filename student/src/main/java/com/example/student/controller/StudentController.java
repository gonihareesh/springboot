package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.Student;
import com.example.student.repository.StudentRepository;
@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/post")
	public Student addElements(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@PutMapping("/update")
	public Student updateElements(@RequestBody Student student) {
		return repo.save(student);
	}
	@GetMapping("/get")
	public List<Student> readElements(){
		return repo.findAll();	}
}
