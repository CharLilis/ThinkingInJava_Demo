package com.lilith.thinkinginjava.unit17;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import static net.mindview.util.Print.*;
/**
 * P485
 * 深入研究容器——Map
 * 测试各个类型的Map
 * @author 56580
 *
 */
public class Maps {
	public static void printKeys(Map<Integer, String> map) {
		printnb("Size = " + map.size() + ". ");
		printnb("Keys: ");
		print(map.keySet());
	}
	public static void test(Map<Integer, String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		//验证重复性
		map.putAll(new CountingMapData(25));
		printKeys(map);
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11):" + map.containsKey(11));
		print("map.get(11):" + map.get(11));
		print("map.containsValue(\"F0\"):" + map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("Frist key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty():" + map.isEmpty());
		map.putAll(new CountingMapData(25));
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty():" + map.isEmpty());
	}
	public static void main(String[] args) {
		test(new HashMap<Integer, String>());
		test(new TreeMap<Integer, String>());
		test(new LinkedHashMap<Integer, String>());
		//key值可重复，基于“==”比较
		test(new IdentityHashMap<Integer, String>());
		test(new ConcurrentHashMap<Integer, String>());
		test(new WeakHashMap<Integer, String>());
	}
}
