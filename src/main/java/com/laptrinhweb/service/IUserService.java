package com.laptrinhweb.service;

import com.laptrinhweb.model.UserModel;

public interface IUserService {
	UserModel findByUsernameAndPasswordAndStatus(String username, String password, Integer status);
}
