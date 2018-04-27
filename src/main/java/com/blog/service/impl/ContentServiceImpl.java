package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blog.dao.ContentMapper;
import com.blog.model.Content;
import com.blog.service.IContentService;
import com.blog.utils.Tools;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("contentService")
public class ContentServiceImpl implements IContentService {

	@Resource
	private ContentMapper contentMapper;
	
	@Override
	public PageInfo<Content> findAllContent(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Content> contents = contentMapper.findAllContent();
		PageInfo<Content> pageInfo = new PageInfo<>(contents);
		return pageInfo;
	}

	@Override
	public Content findContentByIdOrSlug(String cid) {
		if(StringUtils.isNotBlank(cid)) {
			if(Tools.isNumber(cid)) {
				Integer id = Integer.parseInt(cid);
				Content contentTemp = new Content();
				contentTemp.setCid(id);
				Content content = contentMapper.findContentByCondition(contentTemp);
				return content;
			}else {
				String slug = cid ; 
				Content contentTemp = new Content();
				contentTemp.setSlug(slug);
				Content content = contentMapper.findContentByCondition(contentTemp);
				return content;
			}
		}
		return null;
	}

	

}
