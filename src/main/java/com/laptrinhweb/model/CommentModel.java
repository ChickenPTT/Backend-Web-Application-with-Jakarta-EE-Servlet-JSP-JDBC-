package com.laptrinhweb.model;

public class CommentModel extends Astract<CommentModel> {

	private String comment;
	private long user_id;
	private long news_id;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getNews_id() {
		return news_id;
	}

	public void setNews_id(long news_id) {
		this.news_id = news_id;
	}

}