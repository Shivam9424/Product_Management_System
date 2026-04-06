package com.example.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.pms.entity.Product;
import com.example.pms.repository.ProductRepository;

@Service
public  class ProductServiceImplement implements ProductService {
	
	ProductRepository proRep;

	public ProductServiceImplement(ProductRepository proRep) {
		super();
		this.proRep = proRep;
	}
	@Override
	public String addProduct(Product prod) {
		proRep.save(prod);
		return "to add a sucessfully";
		
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
	public String viewProduct(Long prodId) {
		Optional<Product> product = proRep.findById(prodId);
		return "To view the product";
		
	}
	public List<Product> viewAllProduct() {
		return proRep.findAll();
		
	}
	


}
