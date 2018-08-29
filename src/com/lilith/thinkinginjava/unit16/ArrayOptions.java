package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
/**
 * P434
 * 数组——数组是第一级对象
 * 数组的创建方法、赋值方法
 * @author Perform
 *
 */
public class ArrayOptions {
	public static void main(String[] args) {
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		System.out.println("b:" + Arrays.toString(b));
		
		BerylliumSphere[] c = new BerylliumSphere[4];
		for(int i = 0; i < c.length; i++) {
			if(c[i] == null) {
				c[i] = new BerylliumSphere();
			}
		}
		
		//聚集初始化
		BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
		
		//动态的聚集初始化
		a = new BerylliumSphere[] {new BerylliumSphere(), new BerylliumSphere()};
		
		System.out.println("a.length:" + a.length);
		System.out.println("b.length:" + b.length);
		System.out.println("c.length:" + c.length);
		System.out.println("d.length:" + d.length);
		
		a = b;
		System.out.println("a.length:" + a.length);
		
		int[] e;
		int[] f = new int[5];
		System.out.println("f:" + Arrays.toString(f));
		
		int[] g = new int[4];
		for(int i = 0; i < g.length; i++) {
			g[i] = i*i;
		}
		int[] h = {11, 47, 93};
		System.out.println("f.length:" + f.length);
		System.out.println("g.length:" + g.length);
		System.out.println("h.length:" + h.length);
		
		e = h;
		System.out.println("e.length" + e.length);
		e = new int[] {1, 2};
		System.out.println("e.length" + e.length);
	}
}
