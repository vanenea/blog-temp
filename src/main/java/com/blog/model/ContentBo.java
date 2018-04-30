package com.blog.model;

import java.io.Serializable;
import java.util.List;

public class ContentBo implements Serializable {

	private static final long serialVersionUID = 5803823362504026873L;
	private String date;
	private String count;
	private List<Content> articles;
	
	public ContentBo() {
		super();
	}

	public ContentBo(String date, String count, List<Content> articles) {
		super();
		this.date = date;
		this.count = count;
		this.articles = articles;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<Content> getArticles() {
		return articles;
	}

	public void setArticles(List<Content> articles) {
		this.articles = articles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articles == null) ? 0 : articles.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContentBo other = (ContentBo) obj;
		if (articles == null) {
			if (other.articles != null)
				return false;
		} else if (!articles.equals(other.articles))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "articlesBo [date=" + date + ", count=" + count + ", articles=" + articles + "]";
	}
	
	
}
