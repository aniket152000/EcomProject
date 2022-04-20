package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.entity;
import com.example.demo.repository.Repository;
import com.example.demo.service.Services;


@Service
public class implementation implements Services{
	
private final Repository repository;
	
	public implementation(Repository repository) {
		this.repository=repository;
	}

	@Override
	public List<entity> findAllProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<entity> findById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);	
	}

	@Override
	public entity saveProduct(entity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public entity updateProduct(entity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	

	
}
