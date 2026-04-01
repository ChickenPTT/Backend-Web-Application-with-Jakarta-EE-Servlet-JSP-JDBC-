package com.laptrinhweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhweb.dao.INewDAO;
import com.laptrinhweb.dao.impl.NewsDAO;
import com.laptrinhweb.model.NewsModel;
import com.laptrinhweb.service.INewService;

class NewService implements INewService {

	@Inject 
	private INewDAO newDao;

	@Override
	public List<NewsModel> findByCategoryId(long categoryId) {
		
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newModel) {
		newModel.setCreateBy("");
		newModel.setCreateDate(new Timestamp(System.currentTimeMillis()));
		Long newId = newDao.save(newModel);
		return newDao.findOne(newId);
	}

	@Override
	public NewsModel update(NewsModel UpdateNews) {
		NewsModel oldNews = new NewsModel();
		UpdateNews.setCreateBy(oldNews.getCreateBy());
		UpdateNews.setCreateDate(oldNews.getCreateDate());
		UpdateNews.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		UpdateNews.setModifiedBy("");
		newDao.update(UpdateNews);
		return newDao.findOne(UpdateNews.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (Long id: ids) {
			newDao.delete(id);
		}
	}

	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		return newDao.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newDao.getTotalItem();
	}

}
