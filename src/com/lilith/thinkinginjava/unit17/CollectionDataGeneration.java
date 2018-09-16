package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;

import com.lilith.thinkinginjava.unit16.RandomGenerator;
/**
 * P462
 * 深入研究容器——填充容器
 * 测试CollectionData的方法
 * @author 56580
 *
 */
public class CollectionDataGeneration {
	public static void main(String[] args) {
		System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
		System.out.println(new CollectionData<Integer>(new RandomGenerator.Integer(), 10));
	}
}
