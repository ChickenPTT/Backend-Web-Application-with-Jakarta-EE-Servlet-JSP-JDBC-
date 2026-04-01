package com.laptrinhweb.dao;

import java.util.List;

import com.laptrinhweb.dao.impl.CategoryDAO;
import com.laptrinhweb.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO {
	List<CategoryModel> findAll();
}
