package com.laptrinhweb.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Astract<T> {
//	Day la noi chứa những đặc tính chung của các model
	private Long id;
	private Timestamp createDate;
	private Timestamp modifiedDate;
	private String createBy;
	private String modifiedBy;
	private long[] ids;
	private List<T> listResult = new ArrayList<>();
	private Integer page;
	private Integer maxPageItem;
	private Integer totalPage;
	private Integer totalItem;
	private String sortName;
	private String sortBy;
	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setMaxPageItem(Integer maxPageItem) {
		this.maxPageItem = maxPageItem;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public Integer getPage() {
		return page;
	}

	public Integer getMaxPageItem() {
		return maxPageItem;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public Integer getTotalItem() {
		return totalItem;
	}

}

