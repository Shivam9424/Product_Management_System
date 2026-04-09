package com.example.pms.service;

import java.util.List;

import com.example.pms.Dto.ProductRequestDto;
import com.example.pms.entity.Product;

public interface ProductService {
   
	String addProduct(ProductRequestDto prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
     List<Product> viewAllProduct();

}
