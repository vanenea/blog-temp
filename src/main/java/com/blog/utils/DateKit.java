package com.blog.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @describle about date utils 
 * @author CY
 * @date 23.April.2018
 */
public class DateKit {

	/**
	 * 判断是否是今天
	 * @param date
	 * @return Boolean
	 */
	public static boolean isToday(Date date) {
		Calendar today = Calendar.getInstance();
		today.setTime(new Date());
		Calendar date1 = Calendar.getInstance();
		date1.setTime(date);
		return today.get(Calendar.YEAR)==date1.get(Calendar.YEAR) &&
				today.get(Calendar.MONTH)==date1.get(Calendar.MONTH) &&
				today.get(Calendar.DATE)==date1.get(Calendar.DATE);
	}
	
	/**
	 * 两个时间相隔天数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int intervalDay(Date date1,Date date2) {
		long inter = Math.abs(date2.getTime()-date1.getTime());
		long day = inter/86400000;
		return (int)day;
		
	}
	
	/**
	 * String transform Date use format
	 * @param date
	 * @param format
	 * @return
	 */
	public static Date dateFormat(String date,String format) {
		if(date==null) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * String transform Date user default format(yyyy-MM-dd HH:mm:ss)
	 * @param date
	 * @return
	 */
	public static Date dateFormat(String date) {
		return dateFormat(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * Date转换成字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String stringFormat(Date date,String format) {
		if(date==null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	
	public static String stringFormat(Date date) {
		return stringFormat(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 判断是否超过一天
	 * @param date
	 * @return
	 */
	public static boolean isExpiredDay(Date date) {
		Long tem = (new Date().getTime()-date.getTime())/86400000l;
		return  tem>1l;
	}
	
	/**
	 * 得到昨天时间
	 * @return
	 */
	public static Date getYesterday() {
		long yesterday = new Date().getTime()-86400000l;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(sdf.format(new Date(yesterday)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 追溯几天前
	 * @param date
	 * @param interval
	 * @return
	 */
	public static Date getDayAgo(Date date,int interval) {
		long dayAgo = date.getTime()-interval*24*60*60*1000l;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(sdf.format(dayAgo));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 得到间隔未来的时间
	 * @param date
	 * @param interval
	 * @return
	 */
	public static Date getDayFuturn(Date date, int interval) {
		long dayAgo = date.getTime()+interval*24*60*60*1000l;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(sdf.format(dayAgo));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
