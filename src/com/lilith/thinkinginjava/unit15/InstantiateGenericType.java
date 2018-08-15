package com.lilith.thinkinginjava.unit15;
/**
 * P381
 * 擦除的补偿，创建类型的实例
 * Class.newInstance()只支持默认构造器
 * @author 56580
 *
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> caf = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try {
			//Integer没有默认构造器
			ClassAsFactory<Integer> caf2 = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}
}
class ClassAsFactory<T>{
	T t;
	public ClassAsFactory(Class<T> c) {
		try {
			t = c.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
class Employee{}