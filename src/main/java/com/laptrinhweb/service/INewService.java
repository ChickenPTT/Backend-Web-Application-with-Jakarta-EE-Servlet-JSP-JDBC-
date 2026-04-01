package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhweb.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(long categoryId);
	NewsModel save(NewsModel news);
	NewsModel update(NewsModel news);
	void delete(long[] ids);
	List<NewsModel> findAll(Pageble pageble);
	//Integer offset, Integer maxPageItem
	int getTotalItem();
}
