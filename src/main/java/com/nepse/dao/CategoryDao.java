package com.nepse.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nepse.model.Category;


@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>  {
	

	public List<Category> findByName(String name);

}
