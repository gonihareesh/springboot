package com.haripractice.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haripractice.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
