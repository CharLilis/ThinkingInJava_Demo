package com.lilith.cache.demo03;

import java.util.HashMap;

/**
 * 利用HashMap实现LRU策略
 * @author Perform
 * 自己写了个链表结构
 *
 */
public class HashMapCache<K, V> {
	
	private int MAX_CACHE_SIZE;
	
	private Entry<K, V> head;
	private Entry<K, V> tail;
	//用于保持部分对像的引用
	private HashMap<K, Entry<K, V>> cache;
	
	public HashMapCache(int size){
		MAX_CACHE_SIZE = size;
		cache = new HashMap<K, Entry<K, V>>();
	}
	
	public void put(K key, V value){
		Entry<K, V> entry = cache.get(key);
		if(entry == null) {
			if(cache.size() >= MAX_CACHE_SIZE) {
				cache.remove(key);
				updateTail();
			}
			entry = new Entry<K, V>();
			entry.key = key;
			entry.value = value;
			cache.put(key, entry);
			updateHead(entry);
		}else {
			entry.value = value;
			updateHead(entry);
		}
	}
	
	public V get(K key) {
		Entry<K, V> entry = cache.get(key);
		updateHead(entry);
		return entry.value;
	}
	
	/**
	 * 更新顶部元素
	 * @param entry
	 */
	public void updateHead(Entry<K, V> entry) {
		if(entry == head) {
			return;
		}
		
		if(tail == null || head == null) {
			tail = head = entry;
			return;
		}
		
		if(entry == tail) {
			Entry<K, V> pre = entry.pre;
			if(pre != null) {
				tail = pre;
				tail.next = null;
			}
		}
		
		if(entry.pre != null) {
			entry.next.pre = entry.pre;
		}
		if(entry.next != null) {
			entry.pre.next = entry.next;
		}
		entry.pre = null;
		entry.next = head;
		head.pre = entry;
		head = entry;
	}
	
	/**
	 * 更新底部元素
	 */
	public void updateTail() {
		if(tail!=null) {
			Entry<K, V> pre = tail.pre;
			if(pre == null) {
				head = null;
				tail = null;
			}else {
				tail = pre;
				tail.next = null;
			}
		}
	}
	
	/**
	 * 重写toString
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Entry<K, V> entry = head;
		while(entry != null) {
			sb.append(String.format("%s:%s ", entry.key, entry.value));
			entry = entry.next;
		}
		return sb.toString();
	}
	
	private class Entry<K, V>{
		Entry<K, V> pre;
		Entry<K, V> next;
		K key;
		V value;
	}
	
	public static void main(String[] args) {
		HashMapCache<Integer, Integer> cache = new HashMapCache<Integer, Integer>(5);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.toString());
		cache.put(3, 3);
		System.out.println(cache.toString());
		Integer i = cache.get(2);
		System.out.println(i);
		System.out.println(cache.toString());
		cache.put(3, 5);
		System.out.println(cache.toString());
		cache.put(4, 4);
		cache.put(5, 5);
		cache.put(6, 6);
		System.out.println(cache.toString());
		
		
	}

}
