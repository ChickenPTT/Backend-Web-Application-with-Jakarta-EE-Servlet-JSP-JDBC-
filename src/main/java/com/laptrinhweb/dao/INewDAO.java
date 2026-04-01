package com.laptrinhweb.dao;

import java.util.List;

import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhweb.model.NewsModel;

public interface INewDAO extends GenericDAO<NewsModel> {
	NewsModel findOne (Long id);
	List<NewsModel> findByCategoryId(long categoryId);
	Long save(NewsModel newModel);
	void update(NewsModel UpdateNews);
	void delete(Long id);
	List<NewsModel> findAll(Pageble pageble);
	//Integer offset, Integer limit
	int getTotalItem();
}	
