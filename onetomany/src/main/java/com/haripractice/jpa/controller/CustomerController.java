package com.haripractice.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.haripractice.jpa.dto.OrderRequest;
import com.haripractice.jpa.entity.Customer;

import com.haripractice.jpa.repository.CustomerRepo;
import com.haripractice.jpa.repository.ProductRepository;

@RestController
public class CustomerController 
{

	@Autowired
	private CustomerRepo custrepo;
@Autowired
private ProductRepository productrepo;

@PostMapping("/placeorder")
public Customer placeOrder(@RequestBody OrderRequest or) {
	return custrepo.save(or.getCustomer());
}

@GetMapping("/getorders")
public List<Customer> findAllOrders(){
	return custrepo.findAll();
}
@PutMapping("/update")
public Customer update(@RequestBody OrderRequest request) {
	return custrepo.save(request.getCustomer());
}

}
