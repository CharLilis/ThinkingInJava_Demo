package com.lilith.thinkinginjava.unit15;
/**
 * P365
 * 通用构造工具的测试
 * @author 56580
 *
 */
public class CountObject {
	private static long counter = 0;
	private final long id = counter++;
	public long id() {
		return id;
	}
	public String toString() {
		return "CountObject " + id;
	}
}
