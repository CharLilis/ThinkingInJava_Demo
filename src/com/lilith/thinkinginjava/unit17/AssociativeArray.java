package com.lilith.thinkinginjava.unit17;

import static com.lilith.tool.Print.*;
/**
 * P485
 * 深入研究容器——Map
 * 实现简单Map，牺牲性能
 * @author 56580
 *
 * @param <K>
 * @param <V>
 */
public class AssociativeArray<K, V> {
	private Object[][] pairs;
	private int index;
	public AssociativeArray(int size) {
		pairs = new Object[size][2];
	}
	public void put(K k, V v) {
		if(index >= pairs.length) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		pairs[index++] = new Object[] {k, v};
	}
	@SuppressWarnings("unchecked")
	public V get(K k) {
		for(int i = 0; i < pairs.length; i++) {
			if(pairs[i][0].equals(k)) {
				return (V)pairs[i][1];
			}
		}
		return null;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < pairs.length; i++) {
			sb.append(pairs[i][0]);
			sb.append("=");
			sb.append(pairs[i][1]);
			if(i < pairs.length - 1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		AssociativeArray<String, String> map = new AssociativeArray<String, String>(6);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		try {
			map.put("extra", "object");
		} catch (ArrayIndexOutOfBoundsException e) {
			println("Too many objects");
		}
		println(map);
		println(map.get("ocean"));
	}
}
