package com.example.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.pms.Dto.ProductRequestDto;
import com.example.pms.entity.Product;
import com.example.pms.repository.ProductRepository;

@Service
public class ProductServiceImplement implements ProductService {
	
	ProductRepository proRep;

	public ProductServiceImplement(ProductRepository proRep) {
		super();
		this.proRep = proRep;
	}
	public String addProduct(ProductRequestDto prod) {
		Product p = new Product();
		p.setName(prod.getName());
		p.setDescription(prod.getDescription());
		p.setPrice(prod.getPrice());
		p.setPhotoUrl(prod.getPhotoUrl());
		proRep.save(p);
		return "product add the sucessfully";
		
	}
	@Override
	public String updateProduct(Product prod) {
		proRep.save(prod);
		return "To update the sucessfully";
	}
	public String deleteProduct(Long prodId) {
		// TODO Auto-generated method stub
		proRep.deleteById(prodId);
		return "To delete the product";
	}
	public Product viewProduct(Long prodId) {
		return proRep.findById(prodId).get();
	}
	public List<Product> viewAllProduct() {
		return proRep.findAll();
		
}
	}
