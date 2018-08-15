package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lilith.tool.Print;
/**
 * P221	容器的打印
 * @author Perform
 *
 */
public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	
	public static void main(String[] args) {
		//有序，可重复
		Print.println(fill(new ArrayList<String>()));
		//有序，可重复
		Print.println(fill(new LinkedList<String>()));
		//有序，不可重复
		Print.println(fill(new HashSet<String>()));
		//无序，不可重复
		Print.println(fill(new TreeSet<String>()));
		//有序，不可重复
		Print.println(fill(new LinkedHashSet<String>()));
		//不可重复，查询速度最快
		Print.println(fill(new HashMap<String,String>()));
		//按keys升序排序、不可重复
		Print.println(fill(new TreeMap<String,String>()));
		//有序、不可重复，保留了HashMap查询速度快
		Print.println(fill(new LinkedHashMap<String,String>()));
	}
}
