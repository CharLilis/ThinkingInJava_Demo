package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lilith.thinkinginjava.unit15.coffee.Coffee;
import com.lilith.thinkinginjava.unit15.coffee.Latte;
import com.lilith.thinkinginjava.unit15.coffee.Mocha;
/**
 * P424
 * 泛型——对缺乏潜在类型机制的补偿
 * 自定义接口类，使用适配器设计模式
 * @author Perform
 *
 */
public class Fill2 {
	public static <T> void fill(Addable<T> addable, Class<? extends T> type, int size) {
		try {
			for(int i = 0; i < size; i++){
				addable.add(type.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 使用工具类生成对象
	 * @param addable
	 * @param generator
	 * @param size
	 */
	public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
		for(int i = 0; i < size; i++) {
			addable.add(generator.next());
		}
	}
}
interface Addable<T>{
	void add(T t);
}
/**
 * 使用适配器设计模式实现
 * @author Perform
 *
 * @param <T>
 */
class AddableCollectionAdapter<T> implements Addable<T>{
	public Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}
	public void add(T t) {
		c.add(t);
	}
}
class Adapter{
	public static <T> Addable<T> collectionAdapter(Collection<T> c){
		return new AddableCollectionAdapter<T>(c);
	}
}
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
	@Override
	public void add(T t) {
		super.add(t);
	}
}
class Fill2Test{
	public static void main(String[] args) {
		List<Coffee> carrier = new ArrayList<Coffee>();
		Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
		Fill2.fill(new AddableCollectionAdapter(carrier), Latte.class, 2);
		for(Coffee c : carrier) {
			System.out.println(c);
		}
		System.out.println("-----------------");
		
		AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<Coffee>();
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
		for(Coffee c : coffeeQueue) {
			System.out.println(c);
		}
	}
}