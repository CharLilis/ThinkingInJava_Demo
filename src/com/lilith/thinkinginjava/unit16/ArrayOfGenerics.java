package com.lilith.thinkinginjava.unit16;

import java.util.ArrayList;
import java.util.List;
/**
 * P441
 * 数组——数组与泛型
 * 数组虽然无法直接实例化带有泛型的对象，但可以通过强制转换得到带有泛型的对象
 * @author 56580
 *
 */
public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la;
		
		ls[0] = new ArrayList<String>();
//		ls[1] = new ArrayList<Integer>();
		
		Object[] oa = ls;
		oa [1] = new ArrayList<Integer>();
		
		List<BerylliumSphere>[] lb = (List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < lb.length; i++) {
			lb[i] = new ArrayList<BerylliumSphere>();
		}
	}
}
