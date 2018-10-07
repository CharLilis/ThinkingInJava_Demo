package com.lilith.thinkinginjava.unit17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V>{
	private ArrayList<K> keys = new ArrayList<K>();
	private ArrayList<V> values = new ArrayList<V>();
	public V put(K key, V value) {
		V oldValue = get(key);
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	@Override
	public V get(Object key) {
		if(!keys.contains(key)) {
			return null;
		}
		return values.get(keys.indexOf(key));
	}
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> entrySet = new HashSet<Map.Entry<K,V>>();
		Iterator<K> kit = keys.iterator();
		Iterator<V> vit = values.iterator();
		while(kit.hasNext()) {
			entrySet.add(new MapEntry<K, V>(kit.next(), vit.next()));
		}
		return entrySet;
	}
	public static void main(String[] args) {
		SlowMap<String, String> m = new SlowMap<String, String>();
		m.putAll(Countries.capitals(15));
		System.out.println(m);
		System.out.println(m.get("BULGARIA"));
		System.out.println(m.entrySet());
	}
}
