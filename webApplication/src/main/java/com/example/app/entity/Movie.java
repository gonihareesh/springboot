package com.example.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movieTable")
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String producer;
	private String director;
    private int yearRelease;
    private double collections;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYearRelease() {
		return yearRelease;
	}
	public void setYearRelease(int yearRelease) {
		this.yearRelease = yearRelease;
	}
	public double getCollections() {
		return collections;
	}
	public void setCollections(double collections) {
		this.collections = collections;
	}
	
	
    
}
