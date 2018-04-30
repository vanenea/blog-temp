package com.blog.dao;

import java.util.List;

import com.blog.model.Content;
import com.blog.model.ContentBo;

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
	
	/**
	 * 找到ContentBo集合
	 * @return
	 */
	List<ContentBo> findContent();
	
	/**
	 *	根据日期分类
	 * @return
	 */
	List<Content> findContentByDate(String date);
}
