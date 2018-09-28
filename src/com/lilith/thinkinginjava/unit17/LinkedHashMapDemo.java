package com.lilith.thinkinginjava.unit17;

import java.util.LinkedHashMap;
import static net.mindview.util.Print.*;
/**
 * P487
 * 深入研究容器——Map
 * LinkedHashMap的排序算法：插入顺序
 * 						 最近最少使用
 * @author 56580
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData(9));
		print(linkedMap);
		//设置容量，溢出量，采用最近最少使用（LRU）算法
		linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		linkedMap.putAll(new CountingMapData(9));
		print(linkedMap);
		for(int i = 0; i < 6; i++) {
			linkedMap.get(i);
		}
		print(linkedMap);
		linkedMap.get(0);
		print(linkedMap);
	}
}
