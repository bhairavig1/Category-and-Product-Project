package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Product;
import com.springboot.app.servicei.ServiceInt;

@RestController
@RequestMapping("/api/product")
public class ProductController 
{
	@Autowired
	ServiceInt seInt;
	
	@PostMapping("/addproduct")
	public String addData(@RequestBody Product product)
	{
		seInt.addProductData(product);
		
		return "Data Added Successfully";
		
		
	}

	@GetMapping("/getdata/{pid}")
	public Product getProductData(@PathVariable String pid)
	{
		
			Product product =seInt.getSingleProductData(pid);
		
		
			return product;
		
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(@RequestParam int pageNumber, @RequestParam int pageSize)
	{
			
				List<Product> list=seInt.getAllProductData(pageNumber, pageSize);
		
				return list;
		
		
	}
	
	@DeleteMapping("/deleteproduct/{pid}")
	public String deleteProduct(@PathVariable String pid)
	{
		seInt.deleteSingleProduct(pid);
		
		return "deleted";
		
	}
	
	@PutMapping("/updateProduct/{pid}")
	public Product updatePro(@RequestBody Product product, @PathVariable String pid)
	{
			
			Product pp=seInt.updateProductData(product, pid);
		
		
				return pp;
	}
	
}
