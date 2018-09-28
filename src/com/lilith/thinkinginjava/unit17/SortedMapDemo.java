package com.lilith.thinkinginjava.unit17;

import java.util.Iterator;
import java.util.TreeMap;
import static net.mindview.util.Print.*;
/**
 * P486
 * 深入研究容器——Map
 * SortedMap
 * @author 56580
 *
 */
public class SortedMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> sortedMap = new TreeMap<Integer, String>(new CountingMapData(10));
		print(sortedMap);
		Integer low = sortedMap.firstKey();
		Integer high = sortedMap.lastKey();
		print(low);
		print(high);
		Iterator<Integer> it = sortedMap.keySet().iterator();
		for(int i = 0; i <= 6; i++) {
			if(i == 3) low = it.next();
			if(i == 6) high = it.next();
			it.next();
		}
		print(low);
		print(high);
		print(sortedMap.subMap(low, high));
		//截取key值小于参数的map
		print(sortedMap.headMap(high));
		//截取key值大于或等于key值的map
		print(sortedMap.tailMap(low));
	}
}
