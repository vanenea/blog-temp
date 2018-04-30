package com.blog.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.model.ContentBo;
import com.blog.service.IContentService;

@Controller
public class ArchiveController {
	
	public static String THEME = "themes/default";
	
	@Resource
	private IContentService contentService;
	
	@RequestMapping("/archives")
	public String archives(HttpServletRequest request) {
		List<ContentBo> contentBo = contentService.findContentOrderDate();
		request.setAttribute("archives", contentBo);
		return THEME + "/archives";
	}
	@RequestMapping("/links")
	public String links(HttpServletRequest request) {
		return THEME + "/links";
	}
	
}
