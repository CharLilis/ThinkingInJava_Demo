package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
/**
 * P371
 * 构建复杂模型
 * List元组的使用
 * @author 56580
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 */
public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
	public static void main(String[] args) {
		TupleList<Vehicle, Amphibian, String, Integer> tl =
				new TupleList<Vehicle, Amphibian, String, Integer>();
		tl.add(TupleTest.h());
		tl.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String, Integer> f : tl) {
			System.out.println(f);
		}
	}
}
