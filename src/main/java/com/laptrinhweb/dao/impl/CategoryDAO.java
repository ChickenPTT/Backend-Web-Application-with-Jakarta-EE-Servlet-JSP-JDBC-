package com.laptrinhweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhweb.dao.GenericDAO;
import com.laptrinhweb.dao.ICategoryDAO;
import com.laptrinhweb.model.CategoryModel;
import com.latrinhweb.mapper.CategoryMapper;

public class CategoryDAO extends AbstractDAO implements ICategoryDAO {



	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

}
