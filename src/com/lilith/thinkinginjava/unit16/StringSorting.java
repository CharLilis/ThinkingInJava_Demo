package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;
/**
 * P455
 * 数组——Arrays实用功能
 * Arrays.sort()数组排序
 * 可自定义排序模式
 * 针对基本类型实现的快排序
 * 针对对象设计的稳定归并排序
 * @author 56580
 *
 */
public class StringSorting {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before:" + Arrays.toString(sa));
		Arrays.sort(sa);
		System.out.println("After:" + Arrays.toString(sa));
		//打乱顺序
		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println("Reverse:" + Arrays.toString(sa));
		//按字母排序，不区分大小写
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive:" + Arrays.toString(sa));
	}
}
