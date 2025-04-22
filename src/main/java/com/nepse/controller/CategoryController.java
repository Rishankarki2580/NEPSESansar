package com.nepse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nepse.model.Category;
import com.nepse.service.CategoryService;


@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/admin/category/add")
	public String categoryPage(Model model) {
		List<Category> catList=categoryService.getAllCategories();
		model.addAttribute("cat_List", catList);
		return "admin/category";
	}
	
	@PostMapping("/admin/category/add")
	public String saveCategory(@RequestParam("category_name")String catName,
			                   @RequestParam("description")String catDescription,
			                   @RequestParam("parent_category")int catParent) {
		Category cat = new Category();
		cat.setName(catName);
		cat.setDescription(catDescription);
		cat.setParentCat(catParent);
		
		//save category to database
		categoryService.addCategory(cat);
		
		return "redirect:/admin/category/add";
	}
	
	

	@GetMapping("/admin/category/show")
	public String showCategoryes(Model model) {
		List<Category> catList=categoryService.getAllCategories();
		model.addAttribute("cat_List", catList);
		return "admin/category";
	}
	
	@GetMapping("/admin/category/edit/{id}")
	public String edit(Model model,@PathVariable("id") int id) {
		Category editCat=categoryService.getCategoryById(id);
		model.addAttribute("cat_edit",editCat);
		model.addAttribute("edit",true);
		List<Category>catList=categoryService.getAllCategories();
		model.addAttribute("cat_List", catList);
		return "admin/category";
	}
	
	@PostMapping("/admin/category/edit")
	public String updateCategory(@RequestParam("category_id")int id,
			@RequestParam("category_name")String catName,
            @RequestParam("description")String catDescription,
            @RequestParam("parent_category")int catParent) {
		Category category = new Category(id,catName,catDescription,catParent);
		categoryService.updateCategory(category);
		return "redirect:/admin/category/show";
	}
	
	@GetMapping("/admin/category/delete/{id}")
	public String deleteCategory(@PathVariable("id")int id) {
		//deleting persistance object
		//Category category =categoryService.getCategoryById(id);
		
		//deleting transient object
		
		Category category=new Category();
		category.setId(id);
		categoryService.deleteCategory(category);
		return "redirect:/admin/category/show";
	}
	


}
