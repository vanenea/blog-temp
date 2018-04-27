package com.blog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.model.Content;
import com.blog.service.IContentService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @author CY
 * @date 26.April.2018
 *
 */
@Controller
public class ContentController {

	private static final String THEMES = "themes/default"; 
	
	@Resource
	private IContentService contentService; 
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		return index(request,1,12);
	}
	
	@RequestMapping(value= {"/page/{pageNum}","/page/{pageNum}.html"})
	public String index(HttpServletRequest request,@PathVariable int pageNum,@RequestParam(value="pageSize",defaultValue="12") int pageSize) {
		pageNum = pageNum <=0? 1:pageNum;
		PageInfo<Content> contents = contentService.findAllContent(pageNum, pageSize);
		request.setAttribute("articles", contents);
		return THEMES + "/index";
	}
	
	@GetMapping(value= {"/article/{cid}","/article/{cid}.html"})
	public String getArticle(HttpServletRequest request,@PathVariable String cid) {
		Content article = contentService.findContentByIdOrSlug(cid);
		if(article==null) {
			return "notExsitArticle";
		}
		request.setAttribute("article", article);
		request.setAttribute("is_post", true);
		return THEMES + "/post";
	}
}
