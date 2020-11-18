package com.stackroute.service;

import java.util.List;

import com.stackroute.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product findProductById(int id);
	public void saveNewProduct(Product p);
	public boolean deleteProduct(int id);

}
