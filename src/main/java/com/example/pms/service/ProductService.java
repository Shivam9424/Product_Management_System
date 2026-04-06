package com.example.pms.service;

import java.util.List;

import com.example.pms.entity.Product;



public interface ProductService {
   
	String addProduct(Product prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	String viewProduct(Long prodId);
     List<Product> viewAllProduct();
}
