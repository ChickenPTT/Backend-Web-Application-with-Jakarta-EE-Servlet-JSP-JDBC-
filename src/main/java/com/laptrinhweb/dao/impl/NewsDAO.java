package com.laptrinhweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhweb.dao.INewDAO;
import com.laptrinhweb.model.NewsModel;
import com.latrinhweb.mapper.NewMapper;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewDAO {

	@Override
	public List<NewsModel> findByCategoryId(long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewsModel newModel) {
		
		StringBuilder sql = new StringBuilder("INSERT INTO news (title, content, ");
		sql.append("categoryid, thumbnail, shortdecription, createDate, createBy) ");
		sql.append("VALUES(?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newModel.getTitle(), newModel.getContent(), 
				newModel.getCategoryid(), newModel.getThumbnail(), newModel.getShortdecription(), newModel.getCreateDate(),
				newModel.getCreateBy());
	}

	@Override
	public NewsModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewsModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append(" shortdecription = ?, content = ?, categoryid = ?,");
		sql.append(" createdate = ?, createby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortdecription(),
				updateNew.getContent(), updateNew.getCategoryid(), updateNew.getCreateDate(), 
				updateNew.getCreateBy(), updateNew.getModifiedDate(), 
				updateNew.getModifiedBy(), updateNew.getId());
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM news WHERE id = ?";
		update(sql,id); 
		
	}

	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		if (pageble.getSorter() != null) {
			sql.append("ORDER BY" +pageble.getSorter().getSortName()+" " + pageble.getSorter().getSortBy() +"");
		}
		if( pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append("LIMIT "+ pageble.getOffset() +","+pageble.getLimit()+"");	
		}
		return query(sql.toString(), new NewMapper());

	}



	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM news";
		return count(sql);
	}
 
	
	
	

}
