package com.blog.utils;

/**
 * 通用工具类
 * @author CY
 * @date 25.April.2018
 *
 */
public class Tools {
	
	/**
	 * 判断是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		if(null!=str && 0!=str.trim().length() && str.matches("\\d*")) {
			return true;
		}
		return false;
	}
}
