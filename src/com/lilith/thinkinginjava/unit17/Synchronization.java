package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 * P517
 * 使用Collections创建同步容器
 * @author 56580
 *
 */
public class Synchronization {
	public static void main(String[] args) {
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> lsit = Collections.synchronizedList(new ArrayList<String>());
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
		Set<String> sortSet = Collections.synchronizedSortedSet(new TreeSet<String>());
		Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sortMap = Collections.synchronizedSortedMap(new TreeMap<String, String>());
	}
}
