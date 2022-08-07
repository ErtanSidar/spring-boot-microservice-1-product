package com.sha.springbootmicroservice1product.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.repository.IProductRepository;

@Service
public class ProductService implements IProductService{
	
	private IProductRepository productRepository;

	public ProductService(IProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	@Override
	public Product saveProduct(Product product) {
		product.setCreateTime(LocalDateTime.now());
		return productRepository.save(product);
	}
	
	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
}
