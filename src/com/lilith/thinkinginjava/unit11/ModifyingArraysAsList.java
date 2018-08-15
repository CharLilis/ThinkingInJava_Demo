package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * P244
 * Arrays.asList(obj)返回的仍然是obj的引用
 * 也反映了List的底层是数组结构
 * @author Perform
 *
 */
public class ModifyingArraysAsList {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] ints = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list1 = new ArrayList<>(Arrays.asList(ints));
		System.out.println("list1:"+list1);
		Collections.shuffle(list1, rand);
		System.out.println("list1:"+list1);
		System.out.println("ints:"+Arrays.toString(ints));
		list1 = Arrays.asList(ints);
		System.out.println("list1:"+list1);
		Collections.shuffle(list1, rand);
		System.out.println("list1:"+list1);
		System.out.println("ints:"+Arrays.toString(ints));
	}
}
