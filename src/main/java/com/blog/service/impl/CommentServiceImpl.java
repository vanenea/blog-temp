package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.CommentMapper;
import com.blog.model.Comment;
import com.blog.model.CommentExample;
import com.blog.model.Content;
import com.blog.service.ICommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service("commentService")
public class CommentServiceImpl implements ICommentService {

	@Resource
	private CommentMapper commentMapper;
	
	@Override
	public PageInfo<Comment> getComment(Content content,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		CommentExample commentExample = new CommentExample();
		commentExample.createCriteria().andCidEqualTo(content.getCid());
		commentExample.setOrderByClause("created Desc");
		
		List<Comment> comment = commentMapper.selectByExampleWithBLOBs(commentExample);
		PageInfo<Comment> comments = new PageInfo<>(comment);
		return comments;
	}
	
}
