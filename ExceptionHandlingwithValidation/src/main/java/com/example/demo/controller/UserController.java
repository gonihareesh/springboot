package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import jakarta.validation.Valid;
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserRepository userrepo;
	@PostMapping("save")
	public User savealldetails(@Valid @RequestBody User user) {
		return userrepo.save(user);
	}
	@GetMapping("get")
	public List<User> getalldetails(){
		return userrepo.findAll();
		
	}
	@PutMapping("update")
	public User updatealldetails(@RequestBody User user) {
		return userrepo.save(user);
	}
}
