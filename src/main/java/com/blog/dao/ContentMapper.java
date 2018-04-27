package com.blog.dao;

import java.util.List;

import com.blog.model.Content;

public interface ContentMapper {

	/**
	 * 找到所有的文章
	 * @return
	 */
	List<Content> findAllContent();
	
	/**
	 * 根据条件找到相应的文章
	 * @param content
	 * @return
	 */
	Content findContentByCondition(Content content);
		
}
