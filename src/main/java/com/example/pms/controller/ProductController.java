package com.example.pms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pms.entity.Product;
import com.example.pms.service.ProductService;

@RestController
public class ProductController {
 
	ProductService pService;

	public ProductController(ProductService pService) {
		super();
		this.pService = pService;
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product prod ) {
		return pService.addProduct(prod);
	}
	@PatchMapping("/updateProduct")
	public String updateProduct(@PathVariable Product prod) {
		return pService.updateProduct(prod);
	}
	@DeleteMapping("viewProduct/{prodId}")
	public String deleteProduct(@PathVariable Long prodId) {
		return pService.deleteProduct(prodId);
	}
	@GetMapping("/viewAllProducts")
	public String viewProduct(@PathVariable Long prodId) {
		return pService.viewProduct(prodId);
	}
	public List<Product> viewAllProducts() {
		return pService.viewAllProduct();
	}

	// /hello shivam
}
