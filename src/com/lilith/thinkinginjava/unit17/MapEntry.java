package com.lilith.thinkinginjava.unit17;

import java.util.Map;

public class MapEntry<K, V> implements Map.Entry<K, V>{
	private K key;
	private V value;
	public MapEntry(K k, V v) {
		key = k;
		value = v;
	}
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public V setValue(V v) {
		V result = value;
		value = v;
		return result;
	}
	
	@Override
	public int hashCode() {
		return (key == null ? 0 : key.hashCode()) 
				^ (value == null ? 0 : value.hashCode());
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof MapEntry)) return false;
		MapEntry entry = (MapEntry)o;
		return (key == null ? entry.getKey() == null : key.equals(entry.getKey()))
				&& (value == null ? entry.getValue() == null : value.equals(entry.getValue()));
	}
	@Override
	public String toString() {
		return key + "=" + value;
	}

}
