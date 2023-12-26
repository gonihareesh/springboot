package com.haripractice.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haripractice.jpa.dto.OrderRequest;
import com.haripractice.jpa.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	

}
