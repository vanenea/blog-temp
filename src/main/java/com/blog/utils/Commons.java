package com.blog.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

import com.blog.constant.WebConstant;
import com.blog.model.Content;
import com.vdurmont.emoji.EmojiParser;
/**
 * 通用的工具类
 * @author CY
 * @date 26.April.2018
 *
 */
@Component
public class Commons {

	public static String site_option(String str) {
		return str;
	}
	
	public static String site_option(String str1,String str2) {
		return str1+str2;
	}
	
	public static String site_url() {
		return WebConstant.index_url;
	}
	
	public static String site_url(String url) {
		return url;
	}
	
	public static String permalink(Content content) {
		String url = StringUtils.isEmpty(content.getSlug())?content.getCid().toString():content.getSlug();
		return "/article/" + url;
	}
	
	public static String show_thumb(Content content) {
		int cid = content.getCid();
        int size = cid % 20;
        size = size == 0 ? 1 : size;
        return "/user/img/rand/" + size + ".jpg";
	}
	
	public static String show_icon(int cid) {
		return "bg-ico-book";
	}
	
	/**
     * 显示分类
     *
     * @param categories
     * @return
     */
    public static String show_categories(String categories) throws UnsupportedEncodingException {
        if (StringUtils.isNotBlank(categories)) {
            String[] arr = categories.split(",");
            StringBuffer sbuf = new StringBuffer();
            for (String c : arr) {
                sbuf.append("<a href=\"/category/" + URLEncoder.encode(c, "UTF-8") + "\">" + c + "</a>");
            }
            return sbuf.toString();
        }
        return show_categories("默认分类");
    }
    
    /**
     * 获取社交的链接地址
     *
     * @return
     */
    public static Map<String, String> social() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    public static String site_title() {
    	return "";
    }
    
    public static String fmtdate(long expired) {
    	return DateKit.stringFormat(new Date(expired), "yyyy-MM");
    }
    
    public static String fmtdate(long expired,String format) {
    	return DateKit.stringFormat(new Date(expired), format);
    }
    
    /**
     * Markdown转HTML
     * @param article
     * @return
     */
    public static String article(String article) {
    	if(StringUtils.isBlank(article)) {
    		return "";
    	}
    	article = article.replace("<!--more-->", "\r\n");
    	List<Extension> extensions = Arrays.asList(TablesExtension.create());
    	Parser parser = Parser.builder().extensions(extensions).build();
    	Node document = parser.parse(article);
    	HtmlRenderer htmlRenderer = HtmlRenderer.builder().extensions(extensions).build();
    	article = EmojiParser.parseToUnicode(htmlRenderer.render(document)) ;
    	return article;
    }
    
    /**
     * 显示标签
     *
     * @param tags
     * @return
     */
    public static String show_tags(String tags) throws UnsupportedEncodingException {
        if (StringUtils.isNotBlank(tags)) {
            String[] arr = tags.split(",");
            StringBuffer sbuf = new StringBuffer();
            for (String c : arr) {
                sbuf.append("<a href=\"/tag/" + URLEncoder.encode(c, "UTF-8") + "\">" + c + "</a>");
            }
            return sbuf.toString();
        }
        return "";
    }
}
