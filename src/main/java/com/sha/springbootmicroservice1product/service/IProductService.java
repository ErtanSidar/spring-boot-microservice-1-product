package com.sha.springbootmicroservice1product.service;

import java.util.List;

import com.sha.springbootmicroservice1product.model.Product;

public interface IProductService {

	Product saveProduct(Product product);

	void deleteProduct(Long id);

	List<Product> findAllProducts();

}
