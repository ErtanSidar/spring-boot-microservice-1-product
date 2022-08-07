package com.sha.springbootmicroservice1product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.service.IProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllProducts() {
		return ResponseEntity.ok(productService.findAllProducts());
	}
}
