package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.Books;
import com.example.practice.repository.BookRepository;

@RestController
@RequestMapping("books")
public class BooksController 
{
	@Autowired
	private BookRepository brepo;
	
	@PostMapping("/add")
	public Books addElements(@RequestBody Books b) {
		return brepo.save(b);
	}
	@GetMapping("/get")
	public List<Books> getElements(){
		return brepo.findAll();
		}
	
	@PutMapping("/update")
	public Books updateElements(@RequestBody Books b) {
		return brepo.save(b);
	}
	
}
