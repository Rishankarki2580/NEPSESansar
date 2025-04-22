package com.nepse.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.nepse.dao.CategoryDao;
import com.nepse.model.Category;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	
	//apply business logic in here....

	@Override
	public void addCategory(Category cat) {
		//process data from category object and forward it to DAO to be saved
		
		categoryDao.save(cat);
	}

	@Override
	public List<Category> getAllCategories() {
		List<Category>catList=categoryDao.findAll();
		return catList;
	}

	@Override
	public Category getCategoryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		return categoryDao.findById(id).get();
	}

	@Override
	public void updateCategory(Category cat) {

       categoryDao.saveAndFlush(cat);
		
	}

	@Override
	public void deleteCategory(Category cat) {
		categoryDao.delete(cat);
	}
	
	
}
