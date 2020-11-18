package com.stackroute.dao;

import java.util.List;

import com.stackroute.model.Product;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product findProductById(int id);
	public void saveNewProduct(Product p);
	public boolean deleteProduct(int id);
}
