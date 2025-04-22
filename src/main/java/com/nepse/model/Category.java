package com.nepse.model;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity   //marks a class as JPA entity(a presistant POJO class)
@Table(name="category_table")   // Specify the exact table is database that a entity should map to

public class Category implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id                           //Marks as a primary key of entity
	@GeneratedValue(strategy=GenerationType.AUTO)  //JPA provides the best auto generated strategy based on the database
	@Column(name="category_id")  //Used to map a field to column in database
	private int id;
	@Column(name="category_name",unique=true)
	private String name;
	@Column(name="category_desceription")
	private String description;
	@Column(name="parent_category")
	private int parentCat; //to represent parent category of this category
	
	
	public Category() {
		super();
	}





	public Category(int id, String name, String description, int parentCat) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentCat = parentCat;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getParentCat() {
		return parentCat;
	}

	public void setParentCat(int parentCat) {
		this.parentCat = parentCat;
	}

	
	
	

}
