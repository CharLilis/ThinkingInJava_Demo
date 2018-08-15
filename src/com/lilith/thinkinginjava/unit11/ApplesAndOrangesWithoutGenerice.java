package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
/**
 * P216 泛型和类型安全的容器
 * @SuppressWarnings(String params)：抑制警告信息的注解
 * 									unchecked
 * @author 56580
 *
 */
public class ApplesAndOrangesWithoutGenerice {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i=0; i<3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(int i=0; i<apples.size(); i++) {
			((Apple)apples.get(i)).returnId();
		}
	}
}
class Apple{
	private static long count;
	private final long id = count++;
	public long returnId() {
		return id;
	}
}

class Orange{}