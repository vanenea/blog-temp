package com.blog.service;

import java.util.List;

import com.blog.model.Comment;
import com.blog.model.CommentExample;
import com.blog.model.Content;
import com.github.pagehelper.PageInfo;

public interface ICommentService {

	/**
	 * 获得文章评论
	 * @param commentExample
	 * @return
	 */
	PageInfo<Comment> getComment(Content content,int pageNum,int pageSize);
}
