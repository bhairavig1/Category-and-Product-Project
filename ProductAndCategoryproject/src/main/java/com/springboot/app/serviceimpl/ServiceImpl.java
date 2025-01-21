package com.springboot.app.serviceimpl;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Catagory;
import com.springboot.app.model.Product;
import com.springboot.app.repository.PCRepository;
import com.springboot.app.repository.ProductRepository;
import com.springboot.app.servicei.ServiceInt;

@Service
public class ServiceImpl implements ServiceInt
{
	@Autowired
	PCRepository pcRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public void saveAllData(Catagory catagory) 
	{

		pcRepository.save(catagory);
	}

	@Override
	public Catagory getSingleCatagoryData(String id)
	{
		Optional<Catagory> op= pcRepository.findById(id);
		
			if(op.isPresent())
			{
				
				Catagory catagory=op.get();				
				
				return catagory;
			}
			
			else 
			{
			return null;
			}
	
	}

	@Override
	public List<Catagory> getAllData(int pageNumber, int pageSize) 
	{
		Pageable pageable= PageRequest.of(pageNumber, pageSize);
		
			Page<Catagory> pcatagory= this.pcRepository.findAll(pageable);
		
			List<Catagory> allcatagory= pcatagory.getContent();
			
				return (List<Catagory>) allcatagory;
	}

	@Override
	public void deleteSingleCatagory(String id) 
	{
		pcRepository.deleteById(id);
		
	}

	@Override
	public void addProductData(Product product) 
	{
		productRepository.save(product);
	
	}

	@Override
	public Product getSingleProductData(String pid) 
	{
			Optional<Product> op= productRepository.findById(pid);
			
				if(op.isPresent())
				{
					
						Product pp=	op.get();
					
					return pp;
				}
				else {
					return null ;
					}
	
	}

	@Override
	public List<Product> getAllProductData(int pageNumber, int pageSize) 
	{

		Pageable pageable= PageRequest.of(pageNumber, pageSize);
		
		Page<Product> pproduct= productRepository.findAll(pageable);
	
		List<Product> allproduct= pproduct.getContent();
		
			return allproduct;
		
		
	}

	@Override
	public void deleteSingleProduct(String pid)
	{

		productRepository.deleteById(pid);
		
		
	}

	@Override
	public Catagory updateCatagory(Catagory catagory, String cid) 
	{

		Optional<Catagory> ops= pcRepository.findById(cid);
			
		if(ops.isPresent())
		{
			Catagory cat= ops.get();
			
			
			cat.setCname(catagory.getCname());
			
			return pcRepository.save(cat);
			
			}
	
		else {
			
			return pcRepository.save(catagory);
		}
	
	}

	@Override
	public Product updateProductData(Product product, String pid) 
	{

		Optional<Product> ops= productRepository.findById(pid);
		
			if(ops.isPresent())
			{
				Product pro=ops.get();
				
				
				
				pro.setPname(product.getPname());
				pro.setPmanufacturedate(product.getPmanufacturedate());
				pro.setPexpirydate(product.getPexpirydate());
				
				return productRepository.save(pro);
				
			}
		
			else
			{
				return productRepository.save(product);
				
			}
		
		
		
		
		
	}

	



}

