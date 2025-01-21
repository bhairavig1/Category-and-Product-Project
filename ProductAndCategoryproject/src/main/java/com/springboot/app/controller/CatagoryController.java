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

import com.springboot.app.model.Catagory;
import com.springboot.app.servicei.ServiceInt;

@RestController
@RequestMapping("/api/catagory")
public class CatagoryController {
	@Autowired
	ServiceInt serviceInt;

	@PostMapping("/addData")
	public String addData(@RequestBody Catagory catagory) {

		serviceInt.saveAllData(catagory);

		return "Data Saved";
	}

	@GetMapping("/getCat/{id}")
	public Catagory getSingleData(@PathVariable String id) {
		Catagory cat = serviceInt.getSingleCatagoryData(id);

		return cat;

	}
	// http://localhost:8080/getAllCat?pageNumber=3&pageSize=2

	@GetMapping("/getAllCat")
	public List<Catagory> getAll(@RequestParam int pageNumber, @RequestParam int pageSize) {
		List<Catagory> list = serviceInt.getAllData(pageNumber, pageSize);

		return list;
	}

	@DeleteMapping("/deleteCat")
	public String deteteCatagory(@PathVariable String id)
	{
			serviceInt.deleteSingleCatagory(id);
		
			return "deleted";
		
	}
	
	@PutMapping("/update/{cid}")
	public Catagory updateCatagory(@RequestBody Catagory catagory,@PathVariable String cid)
	{
		
		 Catagory catg=serviceInt.updateCatagory(catagory,cid);
		
		return  catg;
	}
}
