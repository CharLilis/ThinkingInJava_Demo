package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.lilith.tool.Print.*;
/**
 * P471
 * 深入研究容器——Collection的功能方法
 * @author 56580
 *
 */
public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.addAll(Countries.names(6));
		c.add("ten");
		c.add("eleven");
		println(c);
		
		Object[] array = c.toArray();
		//返回指定类型的数组
		String[] str = c.toArray(new String[0]);
		println("Collections.max(c) = " + Collections.max(c));
		println("Collections.min(c) = " + Collections.min(c));
		
		Collection<String> c2 = new ArrayList<String>();
		c2.addAll(Countries.names(6));
		c.addAll(c2);
		println(c);
		
		c.remove(Countries.DATA[0][0]);
		println(c);
		
		c.remove(Countries.DATA[1][0]);
		println(c);
		
		c.removeAll(c2);
		println(c);
		
		c.addAll(c2);
		println(c);
		
		String val = Countries.DATA[3][0];
		println("c.contains(" + val + ") = " + c.contains(val));
		
		println("c.containsAll(c2) = " + c.containsAll(c2));
		
		Collection<String> c3 = ((List<String>)c).subList(3, 5);
		//去除c3以外的元素
		c2.retainAll(c3);
		println(c2);
		
		c2.removeAll(c3);
		println("c2.isEmpty() = " + c2.isEmpty());
		
		c = new ArrayList<String>();
		c.addAll(Countries.names(6));
		println(c);
		c.clear();
		println("after c.clear():" + c);
		
		
		
	}
}
