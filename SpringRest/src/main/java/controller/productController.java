package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.services.ProductService;

import entities.Product;

@RestController
public class productController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/test")
	public String test() {
		return "productt";
	}
	
	@GetMapping("/product")
	public List<Product> getProduct(){
		return this.productService.getProduct();
	}
	
	@GetMapping("/product/(productId)")
	public Product getProductById(@PathVariable("productId") int productId) {
		return this.productService.getProductById(productId);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);		
	}
	@PutMapping("product/{productId}")
	public Product updateProductById(@RequestBody Product product,@PathVariable("productId") int productId) {
		return this.productService.updateProductById(product, productId);
	}
	
	@DeleteMapping("product/{productId}")
	public void deleteProductById(@PathVariable("productId") int productId) {
		this.productService.deleteProductById(productId);
	}
}
