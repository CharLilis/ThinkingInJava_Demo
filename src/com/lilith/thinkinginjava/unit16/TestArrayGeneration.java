package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

/**
 * 
 * @author 56580
 *
 */
public class TestArrayGeneration {
	public static void main(String[] args) {
		int size = 6;
		boolean[] a1 = ConvertTo.primitive(Generated.array(
				Boolean.class, new net.mindview.util.CountingGenerator.Boolean(), size));
		System.out.println("a1:" + Arrays.toString(a1));
		short[] a2 = ConvertTo.primitive(Generated.array(
				Short.class, new net.mindview.util.CountingGenerator.Short(), size));
		System.out.println("a2:" + Arrays.toString(a2));
		byte[] a3 = ConvertTo.primitive(Generated.array(
				Byte.class, new net.mindview.util.CountingGenerator.Byte(), size));
		System.out.println("a3:" + Arrays.toString(a3));
		char[] a4 = ConvertTo.primitive(Generated.array(
				Character.class, new net.mindview.util.CountingGenerator.Character(), size));
		System.out.println("a4:" + Arrays.toString(a4));
		int[] a5 = ConvertTo.primitive(Generated.array(
				Integer.class, new net.mindview.util.CountingGenerator.Integer(), size));
		System.out.println("a5:" + Arrays.toString(a5));
		long[] a6 = ConvertTo.primitive(Generated.array(
				Long.class, new net.mindview.util.CountingGenerator.Long(), size));
		System.out.println("a6:" + Arrays.toString(a6));
		float[] a7 = ConvertTo.primitive(Generated.array(
				Float.class, new net.mindview.util.CountingGenerator.Float(), size));
		System.out.println("a7:" + Arrays.toString(a7));
		double[] a8 = ConvertTo.primitive(Generated.array(
				Double.class, new net.mindview.util.CountingGenerator.Double(), size));
		System.out.println("a8:" + Arrays.toString(a8));
	}
}
