package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.List;
/**
 * P400
 * 问题
 * 任何基本类型都不能作为类型参数
 * @author Perform
 *
 */
public class ListOfInt {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			li.add(i);
		}
		for(int i : li) {
			System.out.print(i + " ");
		}
	}
}
