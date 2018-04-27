package com.blog.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类似于redis的一个类
 * @author CY
 *
 */
public class MapCache {

	private static final int DEFAULT_CACHES = 1024;
	public Map<String , CacheObject> mapPool ;
	
	public static MapCache mapCache = new MapCache();
	
	public static MapCache single() {
        return mapCache;
    }
	
	public MapCache() {
		this(DEFAULT_CACHES);
	}
	
	public MapCache(int num) {
		mapPool = new ConcurrentHashMap<String,CacheObject>();
	}
	
	public void set(String key,Object obj) {
		this.hset(key, obj, -1);
	}
	
	public void hset(String key,Object obj,long expired) {
		expired = expired <=0 ? -1:expired;
		if(mapPool.size()>800)
			mapPool.clear();
		CacheObject cache = new CacheObject();
		cache.setKey(key);
		cache.setValue(obj);
		cache.setExpired(expired*60l*1000+System.currentTimeMillis());
		mapPool.put(key, cache);
	}
	
	@SuppressWarnings("unchecked")
	public <T>T get(String key){
		CacheObject cache = mapPool.get(key);
		if(cache!=null) {
			long a = cache.getExpired();
			if(System.currentTimeMillis()>a) {
				return  (T) cache.getValue();
			}else {
				mapPool.remove(key);
			}
		}
		return null;
		
	}

	
	
	
	static class CacheObject{
		private String key;
		private Object value;
		private long expired;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		public long getExpired() {
			return expired;
		}
		public void setExpired(long expired) {
			this.expired = expired;
		}
		
		
	}
}
