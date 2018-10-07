package com.lilith.thinkinginjava.unit17;

import static net.mindview.util.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 * P516
 * 使用Collections创建只读的容器
 * 只读容器调用涉及元素变动的方法时会抛UnsupportedOperationException
 * @author 56580
 *
 */
public class ReadOnly {
	static Collection<String> data = new ArrayList<String>(Countries.names(6));
	public static void main(String[] args) {
		Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
		print(c);
//		c.add("one");
		
		List<String> list = Collections.unmodifiableList(new ArrayList<String>(data));
		ListIterator<String> it = list.listIterator();
		print(it.next());
//		it.add("one");
		
		Set<String> set = Collections.unmodifiableSet(new HashSet<String>(data));
		print(set);
//		set.add("one");
		
		Set<String> sortSet = Collections.unmodifiableSortedSet(new TreeSet<String>(data));
		
		Map<String, String> map = Collections.unmodifiableMap(new HashMap<String, String>(Countries.capitals(6)));
		print(map);
//		map.put("Ralph", "Howdy!");
		
		Map<String, String> sortMap = Collections.unmodifiableSortedMap(new TreeMap<String, String>(Countries.capitals(6)));
		
	}
}
