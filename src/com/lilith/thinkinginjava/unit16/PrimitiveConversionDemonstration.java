package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

/**
 * P449
 * 数组——创建测试数据
 * @author 56580
 *
 */
public class PrimitiveConversionDemonstration {
	public static void main(String[] args) {
		Integer[] a = Generated.array(Integer.class, new net.mindview.util.CountingGenerator.Integer(), 15);
		int[] b = ConvertTo.primitive(a);
		System.out.println(Arrays.toString(b));
		Boolean[] c = Generated.array(Boolean.class, new net.mindview.util.CountingGenerator.Boolean(), 7);
		boolean[] d = ConvertTo.primitive(c);
		System.out.println(Arrays.toString(d));
	}
}
