package com.latrinhweb.mapper;

import java.sql.ResultSet;


import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.model.RoleModel;
import com.laptrinhweb.model.UserModel;

public class UserMapper implements RowMapper<UserModel>  {
		
		@Override
		public UserModel mapRow(ResultSet resultSet) {
			try {
				UserModel user = new UserModel();
				user.setId(resultSet.getLong("id"));
				user.setUsername(resultSet.getString("username"));
				user.setFullname(resultSet.getString("fullname"));
				user.setPasswork(resultSet.getString("password"));
				user.setStatus(resultSet.getInt("status"));
				RoleModel role = new RoleModel();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				
				
			}catch (Exception e) {
				return null;
			}
			return null;
		}
		
}
