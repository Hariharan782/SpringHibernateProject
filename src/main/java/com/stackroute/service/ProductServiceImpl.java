package com.stackroute.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.dao.ProductDao;
import com.stackroute.model.Product;

@Service ("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public Product findProductById(int id) {
		return productDao.findProductById(id);
	}

	public void saveNewProduct(Product p) {
		productDao.saveNewProduct(p);
	}

	public boolean deleteProduct(int id) {
		Product p = findProductById(id);
		if(p.getProductCategory().equals("Stationary")) {
			return productDao.deleteProduct(id);
		}
		return false;
	}
}
