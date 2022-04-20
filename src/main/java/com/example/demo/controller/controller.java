package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.entity;
import com.example.demo.service.Services;

@RestController
@RequestMapping("/products")
public class controller {
	
	private final Services services;
	
	public controller(Services services){
		this.services=services;
	}
	
	@GetMapping
	public List<entity>getallProducts(){
		return services.findAllProducts();
	}
	
	@GetMapping("/{id}")
	public Optional<entity>getProductsById(@PathVariable("id") Integer id){
		return services.findById(id);
	}
	
	@PostMapping
	public entity postProduct(@RequestBody entity Entity) {
		return services.saveProduct(Entity);
	}
	
	@PutMapping
	public entity update(@RequestBody entity Entity) {
		return services.updateProduct(Entity);
		
	}
	
	@DeleteMapping("/{id}")	
	public void deleteProductById(@PathVariable("id") Integer id) {
		services.deleteProduct(id);	
	}
	
}
