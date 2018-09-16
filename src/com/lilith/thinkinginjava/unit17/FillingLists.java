package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * P460
 * 容器深入研究——填充容器
 * 
 * @author 56580
 *
 */
public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World"));
		System.out.println(list);
	}
}
class StringAddress{
	private String s;
	public StringAddress(String str) {
		this.s = str;
	}
	public String toString() {
		return super.toString() + " " + s;
	}
}
