package com.example.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.TeacherRepository;

@RestController
@RequestMapping("teacher")
public class TeacherController 
{
	@Autowired
	private TeacherRepository repo;
	
	@PostMapping("set")
	public Teacher addElements(@RequestBody Teacher teacher) {
		return repo.save(teacher);
	}
	@GetMapping("get")
	public List<Teacher> getElements(@RequestBody Teacher teacer){
		return repo.findAll();
		}
	@PutMapping("update")
	public Teacher updateElements(@RequestBody Teacher teacher) {
		return repo.save(teacher);
	}

}
