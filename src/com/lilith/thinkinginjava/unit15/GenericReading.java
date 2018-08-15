package com.lilith.thinkinginjava.unit15;

import java.util.Arrays;
import java.util.List;
/**
 * P394
 * 泛型——通配符
 * 联系协变类型和通配符
 * @author 56580
 *
 */
public class GenericReading {
	static <T> T readExact(List<T> list) {
		return list.get(0);
	}
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruit = Arrays.asList(new Fruit());
	static void f1() {
		Apple a = readExact(apples);
		Fruit f = readExact(fruit);
		f = readExact(apples);
	}
	static class Reader<T>{
		T readExact(List<T> list) {
			return list.get(0);
		}
	}
	static void f2() {
		Reader<Fruit> reader = new Reader<Fruit>();
		Fruit f = reader.readExact(fruit);
		//泛型没有协变性
//		Apple a = reader.readExact(apples);
	}
	static class CovariantReader<T>{
		T readExact(List<? extends T> list) {
			return list.get(0);
		}
	}
	static void f3() {
		//使用通配符让容器实现数组的协变性
		CovariantReader<Fruit> cr = new CovariantReader<Fruit>();
		Fruit f = cr.readExact(fruit);
		Fruit a = cr.readExact(apples);
	}
	public static void main(String[] args) {
		f1();
		f2();
		f3();
	}
	
}
