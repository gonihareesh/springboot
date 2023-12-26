package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.entity.Movie;
import com.example.app.repository.MovieRepository;
@Controller

@RequestMapping("movie")
public class MovieController 
{
	@Autowired
	private MovieRepository repo;
	
	@PostMapping("/post")
	public Movie addElements(@RequestBody Movie movie) {
		return repo.save(movie);
	}
	@GetMapping("/get")
	public List<Movie> getElements(){
		return repo.findAll();
		}
	@PutMapping("/update")
	public Movie updateElements(@RequestBody Movie movie) {
		return repo.save(movie);
	}
}
