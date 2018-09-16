package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
import java.util.Random;

import net.mindview.util.Generator;
/**
 * P452
 * 数组——Arrays适用功能
 * 数组排序和自定义对象比较
 * 实现Comparable.compareTo()，
 * 当前对象比参数对象小的返回负数
 * 当前对象等于参数对象的返回0
 * 当前对象比参数对象大的返回正数
 * @author Perform
 *
 */
public class CompType implements Comparable<CompType>{
	int i;
	int j;
	private static int count = 1;
	public CompType(int n1, int n2) {
		this.i = n1;
		this.j = n2;
	}
	public String toString() {
		String result = "[i = " + i + ",j = " + j + "]";
		if(count++ % 3 == 0) {
			result += "\n";
		}
		return result;
	}
	/**
	 * 对象比较方法
	 * 当前对象比参数对象小则返回负数
	 * 当前对象等于参数对象则返回0
	 * 当前对象比参数对象大则返回正数
	 */
	public int compareTo(CompType o) {
		return (i < o.i ? -1 : (i == o.i ? 0 : 1));
	}
	private static Random r = new Random(47);
	public static Generator<CompType> generator(){
		return new Generator<CompType>() {
			public CompType next() {
				return new CompType(r.nextInt(100), r.nextInt(100));
			}
		};
	}
	
	public static void main(String[] args) {
		CompType[] a = net.mindview.util.Generated.array(new CompType[12], generator());
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
		
	}
}
