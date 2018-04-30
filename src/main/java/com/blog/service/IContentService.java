package com.blog.service;

import java.util.List;

import com.blog.model.Content;
import com.blog.model.ContentBo;
import com.github.pagehelper.PageInfo;

public interface IContentService {

	/**
	 * 找到所有的文章
	 * @return
	 */
	PageInfo<Content> findAllContent(int pageNum,int pageSize);
	
	/**
	 * 根据条件找到相应的文章
	 * @param content
	 * @return
	 */
	Content findContentByIdOrSlug(String cid);
	
	/**
	 * 根据日期找到对象
	 * @return
	 */
	List<ContentBo> findContentOrderDate();
}
