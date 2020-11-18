package com.stackroute.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.stackroute.model.Product;
import com.stackroute.service.ProductService;

public class ProductApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		appCtx.scan("com.stackroute");
		appCtx.refresh();
		
		ProductService productService = (ProductService)appCtx.getBean("ProductService");
		
		productService.saveNewProduct(new Product("Pen", "Stationary", 67));
		productService.saveNewProduct(new Product("Pencil", "Stationary", 6));
	
		List<Product> allProducts = productService.getAllProducts();
		for(Product p : allProducts) {
			System.out.println(p);
		}
	}
}
