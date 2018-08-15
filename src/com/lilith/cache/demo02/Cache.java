package com.lilith.cache.demo02;

/**
 * 缓存对象类
 * @author Perform
 *
 */
public class Cache implements Comparable{
	private String key;
	private Object value;
	private boolean clearFlag;//持久化标志
	
	public Cache(Object value) {
		this.value = value;
	}

	/**
	 *对于一个缓存对象，随机返回一个key
	 * @return
	 */
	public synchronized String getKey() {
		if(key == null) {
			//随机数
			key = "";
		}
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public boolean getClearFlag() {
		return clearFlag;
	}

	public void setClearFlag(boolean clearFlag) {
		this.clearFlag = clearFlag;
	}

	@Override
	public int compareTo(Object obj) {
		Cache cache = (Cache)obj;
		return this.key.compareTo(cache.key);
	}
	
}
