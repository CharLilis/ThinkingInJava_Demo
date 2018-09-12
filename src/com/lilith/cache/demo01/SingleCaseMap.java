package com.lilith.cache.demo01;

import java.util.HashMap;
import java.util.Map;
/**
 * 简单的缓存对象
 * @author Perform
 *
 */
public class SingleCaseMap {
	//单例模式
	private static final SingleCaseMap singleMap = new SingleCaseMap();
	private Map<String, Object> cacheMap = new HashMap<String, Object>();
	/**
	 * 私有化构造器
	 */
	private SingleCaseMap() {
		
	}
	
	/**
	 * 获得实例
	 * @return
	 */
	public static SingleCaseMap getInstance() {
		return singleMap;
	}
	
	/**
	 * 取出缓存
	 * @param key
	 * @return
	 */
	public Object getValue(String key) {
		return singleMap.getValue(key);
	}
	
	/**
	 * 放入缓存
	 * @param key
	 * @param value
	 */
	public void put(String key, String value) {
		singleMap.put(key, value);
	}
	

}
