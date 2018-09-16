package com.lilith.thinkinginjava.unit17;

import java.util.LinkedHashSet;
import java.util.Set;

import com.lilith.thinkinginjava.unit15.Generator;
/**
 * P461
 * 深入研究容器——填充容器
 * @author 56580
 *
 */
public class CollectionDataTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData(new Government(), 15));
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}
class Government implements Generator<String>{
	String[] foundation = ("strange women lying in ponds distributing swords is no basis for a system of government").split(" ");
	private int index;
	public String next() {
		return foundation[index++];
	}
}
