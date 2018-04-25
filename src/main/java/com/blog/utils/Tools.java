package com.blog.utils;

public class Tools {
	
	public static boolean isNumber(String str) {
		if(null!=str && 0!=str.trim().length() && str.matches("\\d*")) {
			return true;
		}
		return false;
	}
}
