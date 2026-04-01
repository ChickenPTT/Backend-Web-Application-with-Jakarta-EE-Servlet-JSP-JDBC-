package com.latrinhweb.mapper;

import java.sql.ResultSet;

import com.laptrinhweb.model.NewsModel;

public class NewMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet resultSet) {
		
		try {
			NewsModel news = new NewsModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setContent(resultSet.getString("content"));
			news.setCategoryid(resultSet.getLong("categoryid"));
			news.setThumbnail(resultSet.getString("thumbnail"));
			news.setShortdecription(resultSet.getString("shortdecription"));
			news.setCreateBy(resultSet.getString("createby"));
			news.setCreateDate(resultSet.getTimestamp("createdate"));
			return news;
		} catch (Exception e) {
			return null;
		}
		
		
	} 
	
	

}
