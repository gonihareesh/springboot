package com.example.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entity.Books;
@Repository
public interface BookRepository extends MongoRepository<Books, Integer>{

}
