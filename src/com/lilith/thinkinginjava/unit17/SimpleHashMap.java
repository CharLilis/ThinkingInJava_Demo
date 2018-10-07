package com.lilith.thinkinginjava.unit17;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/**
 * P493
 * 深入研究容器——Map，为速度而散列
 * 实现散列Map
 * @author 56580
 *
 * @param <K>
 * @param <V>
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
	final static int SIZE = 997;
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) 
			buckets[index] = new LinkedList<MapEntry<K,V>>();
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
 		boolean found = false;
 		MapEntry<K, V> newEntry = new MapEntry<K, V>(key, value);
// 		for(MapEntry<K, V> entry : bucket) {
// 			if(newEntry.getKey().equals(entry.getKey())) {
// 				oldValue = entry.getValue();
// 				entry.setValue(value);
// 				found = true;
// 				break;
// 			}
// 		}
 		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
 		while(it.hasNext()) {
 			MapEntry<K, V> pair = it.next();
 			if(pair.getKey().equals(key)) {
 				oldValue = pair.getValue();
 				it.set(newEntry);
 				found = true;
 				break;
 			}
 		}
 		if(!found) {
 			bucket.add(newEntry);
 		}
		return oldValue;
	}
	@Override
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) return null;
		for(MapEntry<K, V> entry : buckets[index]) {
			if(entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}
	/**
	 * 生成器
	 */
	public Set<Map.Entry<K, V>> entrySet() {
		HashSet<Map.Entry<K, V>> entrySet = new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K, V>> list : buckets) {
			if(list == null) continue;
			for(MapEntry<K, V> entry : list) {
				entrySet.add(entry);
			}
		}
		return entrySet;
	}
	public static void main(String[] args) {
		SimpleHashMap<String, String> m = new SimpleHashMap<String, String>();
		m.putAll(Countries.capitals(25));
		System.out.println(m);
		System.out.println(m.get("ERITREA"));
		System.out.println(m.entrySet());
	}
}
