package com.lilith.thinkinginjava.unit14;
/**
 * P341
 * 空对象的应用
 * 人的信息
 * @author 56580
 *
 */
public class Person	{
	//姓
	public final String first;
	//名
	public final String last;
	//地址
	public final String address;
	public Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}
	/**
	 * 人的空对象
	 * @author 56580
	 *
	 */
	public static class NullPerson extends Person implements Null{
		public NullPerson() {
			super("None", "None", "None");
		}
		@Override
		public String toString() {
			return "NullPerson";
		}
	}
	//单例模式
	public static final Person Null = new NullPerson();
}
