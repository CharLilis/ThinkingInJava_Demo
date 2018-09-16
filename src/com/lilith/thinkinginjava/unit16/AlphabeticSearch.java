package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;
/**
 * P456
 * 数组——Arrays使用功能
 * @author 56580
 *
 */
public class AlphabeticSearch {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[30], new RandomGenerator.String(5));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(sa));
		int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
		System.out.println("Index:" + index + "\n" + sa[index]);
	}
}
