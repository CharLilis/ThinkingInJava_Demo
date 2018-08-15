package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * P220
 * 测试Collection的添加元素的方法
 * @author 56580
 *
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collections = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		Integer[] moresInts = {1, 2, 3, 4, 5, 6};
		//Collection.addAll的参数只能放入Collection类型，性能好
		collections.addAll(Arrays.asList(moresInts));
		//Collections.addAll的参数时可变列表
		Collections.addAll(collections, 7,8,9,0);
		Collections.addAll(collections, moresInts);
		List<Integer> lists = Arrays.asList(moresInts);
		lists.set(1, 99);
		lists.add(22);
		
	}
}
