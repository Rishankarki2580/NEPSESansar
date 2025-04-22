package com.nepse.service;

import java.util.List;
import com.nepse.model.Category;

public interface CategoryService {
	
	  public void addCategory(Category cat);
	    
	    public List<Category>getAllCategories();
	    
	    public Category getCategoryByName(String name);
	    
	    public Category getCategoryById(int id);
	    
	    public void updateCategory(Category cat);
	    
	    public  void deleteCategory(Category cat);

}
