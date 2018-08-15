package com.lilith.cache.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 *	缓存管理类
 *	功能：放入缓存时会自动返回key，可通过key取出缓存对象，去除缓存对象时会在缓存中删除调该对象
 *	
 *	后续开发：	1、可自定义缓存大小
 *			2、可设置缓存持久化时间
 *			3、定时清理缓存
 *			4、缓存持久化
 *			5、自动生成key
 *			6、缓存是否可以被覆盖
 * @author Perform
 *
 */
public class CacheManager {
	
	private Map<String, Cache> cacheMap = new HashMap<String, Cache>();
	
	private static CacheManager cacheMgr = new CacheManager();
	
	private CacheManager() {}
	
	public static CacheManager getInstance() {
		return cacheMgr;
	}
	
	/**
	 * 存入缓存，返回key
	 * @param value
	 * @return
	 */
	public String put(String key, Object value) {
		Cache cache = new Cache(value);
//		String key = cache.getKey();
		cacheMap.put(key, cache);
		return key;
	}
	
	/**
	 * 获取缓存对象
	 * @param key
	 * @return
	 */
	public Object getValue(String key) {
		Cache cache = cacheMap.get(key);
		return cache.getValue();
	}
	
	/**
	 * 删除指定缓存
	 * @param key
	 */
	public void deleteValue(String key) {
		Cache cache = cacheMap.get(key);
		if(cache.getClearFlag()) {
			cacheMap.remove(key);
		}
	}
	
	/**
	 * 清除缓存
	 */
	public void clear() {
		cacheMap.clear();
	}
	
}
