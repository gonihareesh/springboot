package com.haripractice.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Customer 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String gender;
	
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	//to maintain relationship between one to many entity...
	//When the target collection is a java.util.Map, the cascade element applies to the map value.
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	//cp-fk(customer Product foreign key...)
	@JoinColumn(name="cp-fk",referencedColumnName = "id")
	//referencedColumnName = "id" to map customer id 
	private List<Product> products;
}
