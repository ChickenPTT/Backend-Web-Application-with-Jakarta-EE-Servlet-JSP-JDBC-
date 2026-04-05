package com.laptrinhweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhweb.dao.INewDAO;
import com.laptrinhweb.dao.IUserDAO;
import com.laptrinhweb.dao.impl.NewsDAO;
import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.model.UserModel;
import com.laptrinhweb.service.INewService;
import com.laptrinhweb.service.IUserService;

class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;
	
	
	@Override
	public UserModel findByUsernameAndPasswordAndStatus(String username, String password, Integer status) {
		return userDAO.findByUsernameAndPasswordAndStatus(username, password, status);
	}


}
