package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import static net.mindview.util.Print.*;

public class Utilities {
	static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));
	public static void main(String[] args) {
		print(list);
		//生成一个不可变、包含参数的Set
		print("'list' singletonList(Four): " + Collections.singletonList("Four"));
		//检查两个容器是否有相同元素
		print("'list' disjoint (Four)?: " + Collections.disjoint(list, Collections.singletonList("Four")));
		print("max: " + Collections.max(list));
		print("min: " + Collections.min(list));
		print("max w/ comparator: " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
		print("min w/ comparator: " + Collections.min(list, String.CASE_INSENSITIVE_ORDER));
		List<String> sublist = Arrays.asList("Four five six".split(" "));
		print("indexOfSubList: " + Collections.indexOfSubList(list, sublist));
		print("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
		Collections.replaceAll(list, "one", "yo");
		print("replaceAll: " + list);
		Collections.reverse(list);
		print("reverse: " + list);
		Collections.rotate(list, 3);
		print("rotate: " + list);
		List<String> source = Arrays.asList("in the matrix".split(" "));
		Collections.copy(list, source);
		print("copy: " + list);
		//交换指定位置的元素
		Collections.swap(list, 0, list.size() - 1);
		print("swap: " + list);
		Collections.shuffle(list, new Random(47));
		print("shuffle: " + list);
		Collections.fill(list, "pop");
		print("fill: " + list);
		//返回Collection中等于参数的元素的个数
		print("frequency: " + Collections.frequency(list, "pop"));
		List<String> dups = Collections.nCopies(3, "snap");
		print("dups: " + dups);
		//检查两个集合中是否有相同的元素
		print("'list' disjoint 'dups'?: " + Collections.disjoint(list, dups));
		Enumeration<String> e = Collections.enumeration(dups);
		Vector<String> v = new Vector<String>();
		while(e.hasMoreElements()) {
			v.addElement(e.nextElement());
		}
		ArrayList<String> arrayList = Collections.list(v.elements());
		print("arrayList: " + arrayList);
	}
}
