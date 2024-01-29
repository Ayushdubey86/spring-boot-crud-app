package com.springrest.SpringRest.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductRepository;
import entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
	    List<Product> list=(List<Product>)this.productRepository.findAll();
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Product product=null;
		try {
			product=this.productRepository.findById(productId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		//list.add(product);
		return productRepository.save(product);
		//return product;
	}

	@Override
	public Product updateProductById(Product product, int productId) {
		// TODO Auto-generated method stub
        product.setId(productId);
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int productId) {
		// TODO Auto-generated method stub
		//list.stream().filter(product->product.getId()!=productId).collect(Collectors.toList());
	    productRepository.deleteById(productId);
		
	}
	

}
