package com.stackroute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductTable")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productNo;

	private String productName;
	private String productCategory;
	private int price;

	public Product() {
		super();
	}

	public Product(String productName, String productCategory, int price) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", productCategory="
				+ productCategory + ", price=" + price + "]";
	}
}
