package com.lilith.thinkinginjava.unit17;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import static com.lilith.tool.Print.*;
/**
 * P479
 * 深入研究容器——Set和存储顺序
 * SortedSet
 * @author Perform
 *
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		//按对象的对比函数规避元素排序
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
		println(sortedSet);
		String low = sortedSet.first();
		String high = sortedSet.last();
		println(low);
		println(high);
		Iterator<String> it = sortedSet.iterator();
		for(int i = 0; i <= 6; i++) {
			if(i ==3) low = it.next();
			if(i ==6) high = it.next();
			else it.next();
		}
		println(low);
		println(high);
		println(sortedSet.subSet(low, high));
		//生成小于参数的元素组成
		println(sortedSet.headSet(high));
		//生成大于或等于参数的元素组成
		println(sortedSet.tailSet(low));
	}
}
