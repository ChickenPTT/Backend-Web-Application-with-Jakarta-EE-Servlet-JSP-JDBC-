package com.laptrinhweb.model;

public class NewsModel extends Astract<NewsModel> {

	private String title;
	private String thumbnail;
	private String shortdecription;
	private String content;
	private Long categoryid;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortdecription() {
		return shortdecription;
	}

	public void setShortdecription(String shortdecription) {
		this.shortdecription = shortdecription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

}
