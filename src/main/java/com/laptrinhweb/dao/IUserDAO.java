package com.laptrinhweb.dao;


import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
	UserModel findByUsernameAndPasswordAndStatus(String name, String password, Integer status);
}	
