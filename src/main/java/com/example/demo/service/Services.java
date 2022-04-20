package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.entity;



public interface Services {
	List<entity>findAllProducts();
	Optional<entity> findById(Integer id);
	entity saveProduct(entity Entity);
	entity updateProduct(entity Entity);
	void deleteProduct(Integer id);
}
