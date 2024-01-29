package com.springrest.SpringRest.services;

import java.util.List;
import entities.Product;

public interface ProductService {

	public List<Product> getProduct();

	public Product getProductById(int productId);

	public Product addProduct(Product product);

	public Product updateProductById(Product product, int productId);

	public void deleteProductById(int productId);
}
