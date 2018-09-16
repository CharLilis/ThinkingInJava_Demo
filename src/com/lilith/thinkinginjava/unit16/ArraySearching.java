package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;
/**
 * P455
 * 数组——Arrays实用功能
 * 对已排序的数组进行查找
 * @author 56580
 *
 */
public class ArraySearching {
	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		while(true) {
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if(location >= 0) {
				System.out.println("Location of " + r + " is " + location + " a[" + location + "] = " + a[location]);
				break;
			}
		}
	}
}
