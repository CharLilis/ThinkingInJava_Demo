package com.lilith.thinkinginjava.unit15.coffee;

import java.util.Iterator;
import java.util.Random;

import com.lilith.thinkinginjava.unit15.Generator;
/**
 * P359
 * 泛型接口的使用
 * 本类支持迭代器，更能方便的从foreach中使用
 * @author Perform
 *
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = {Latte.class, Mocha.class, 
					Cappuccino.class, Americano.class, Breve.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int sz) {
		this.size = sz;
	}
	/**
	 * 实现迭代器
	 * 迭代器的使用：方便取出对象中的数据，不会修改数据
	 * @author Perform
	 *
	 */
	class CoffeeIteratro implements Iterator<Coffee>{
		int count = size;
		public boolean hasNext() {
			return count > 0;
		}
		public Coffee next() {
			count --;
			//使用OutClassName.class获得外部类对象的引用
			return CoffeeGenerator.this.next();
		}
		private void remo() {
			throw new UnsupportedOperationException();
		}
	}
	public Iterator<Coffee> iterator() {
		return new CoffeeIteratro();
	}
	/**
	 * 返回随机的Coffee类型对象
	 */
	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for(Coffee c : new CoffeeGenerator(5)) {
			System.out.println(c);
		}
	}
}
