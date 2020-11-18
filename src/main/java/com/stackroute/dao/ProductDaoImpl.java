package com.stackroute.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.stackroute.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public List<Product> getAllProducts() {
		Query query = getSession().createQuery("from Product");
		return query.list();
	}

	public Product findProductById(int id) {
		Query query = getSession().createQuery("from Product where productId = " + id);
		return (Product) query.uniqueResult();
	}

	public void saveNewProduct(Product p) {
		getSession().save(p);
	}

	public boolean deleteProduct(int id) {
		Query query = getSession().createQuery("delete from ProductTable where productId = " + id);
		query.executeUpdate();
		return true;
	}

}
