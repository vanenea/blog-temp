package com.blog.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author CY
 * @date 26.April.2018
 *
 */
public class IPKit {
	
	/**
	 * 获得IP地址
	 * @param request
	 * @return
	 */
	public static String getIpAddrByRequest(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if(ip==null || ip.trim().length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(ip==null || ip.trim().length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip==null || ip.trim().length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	public static String getRealIp() throws SocketException {
		String localIp = null;
		String netIp = null;
		Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
		InetAddress ip = null;
		boolean finded = false; 
		while(!finded && networkInterface.hasMoreElements()) {
			NetworkInterface ni = networkInterface.nextElement();
			Enumeration<InetAddress> ia = ni.getInetAddresses();
			while(ia.hasMoreElements()) {
				ip = ia.nextElement();
				if(!ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")) {
					netIp = ip.getHostAddress();
					finded = true;
					break;
				}else if(ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")) {
					localIp = ip.getHostAddress();
				}
			}
		}
		if(netIp != null && !"".equals(netIp)) {
			return netIp;
		}else {
			return localIp;
		}
	}
}
