package com.lilith.cache.demo03;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * LRU:Least Recently Used(最近最久未使用策略)
 * @author Perform
 * 利用LinkedHashMap实现LRU缓存
 * 1、长度固定
 * 2、当缓存满了时自动删除最近最久未使用的
 *
 */
public class LRU1<K, V> {
	private final int MAX_CACHE_SIZE;
	private final float DEFAULT_LOAN_FACTORY = 0.75f;
	
	LinkedHashMap<K, V> map;
	
	public LRU1(int size) {
		MAX_CACHE_SIZE = size;
		int length = (int)Math.ceil((MAX_CACHE_SIZE/DEFAULT_LOAN_FACTORY)+1);
		map = new LinkedHashMap<K, V>(length, DEFAULT_LOAN_FACTORY, true){
			@Override
			/**
			 * 自动删除方法
			 */
			protected boolean removeEldestEntry(java.util.Map.Entry<K, V> arg0) {
				return size() > MAX_CACHE_SIZE;
			}
		};
	}
	
	public synchronized void put(K key, V value) {
		map.put(key, value);
	}
	
	public synchronized V get(K key) {
		return map.get(key);
	}
	
	public synchronized void remove(K key) {
		map.remove(key);
	}
	
	public synchronized Set<Entry<K, V>> getAll(){
		return map.entrySet();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry<K, V> entry : map.entrySet() ) {
			sb.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		LRU1<Integer, Integer> lru = new LRU1<Integer, Integer>(5);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		System.out.println(lru.toString());
		lru.get(2);
		System.out.println(lru.toString());
		lru.put(4, 4);
		lru.put(5, 5);
		lru.put(6, 6);
		System.out.println(lru.toString());
	}
}
