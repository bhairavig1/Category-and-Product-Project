package com.springboot.app.servicei;

import java.util.List;

import com.springboot.app.model.Catagory;
import com.springboot.app.model.Product;

public interface ServiceInt {

	public void saveAllData(Catagory catagory);

	public Catagory getSingleCatagoryData(String id);

	public List<Catagory> getAllData(int pageNumber, int pageSize);

	public void deleteSingleCatagory(String id);

	public void addProductData(Product product);

	public Product getSingleProductData(String pid);

	public List<Product> getAllProductData(int pageNumber, int pageSize);

	public void deleteSingleProduct(String pid);

	public Catagory updateCatagory(Catagory catagory,String cid);

	public Product updateProductData(Product product, String pid);

}
