package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository  prodRepo;
	
	public	List<Product> getProducts(){
		return prodRepo.findAll();
	}
	public void addProduct(Product product) {
		prodRepo.save(product);
	}
	public void updateProduct(Product product, Integer id) {
		Optional<Product> p =prodRepo.findById(id);
		
		prodRepo.findByName(p.get().getName());
		prodRepo.save(product);
	}
}
