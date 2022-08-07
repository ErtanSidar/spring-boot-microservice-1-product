package com.sha.springbootmicroservice1product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.springbootmicroservice1product.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {
	
}
