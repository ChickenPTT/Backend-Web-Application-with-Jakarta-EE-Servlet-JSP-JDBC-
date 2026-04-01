package com.laptrinhweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhweb.dao.ICategoryDAO;
import com.laptrinhweb.model.CategoryModel;
import com.laptrinhweb.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDAO;
	
	
	public List<CategoryModel> findAll() {
		
		return categoryDAO.findAll();
	}
}
