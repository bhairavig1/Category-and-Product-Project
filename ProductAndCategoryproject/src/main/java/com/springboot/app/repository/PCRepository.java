package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.Catagory;
import com.springboot.app.model.Product;

@Repository
public interface PCRepository extends JpaRepository<Catagory, String>
{

	

	
}
