package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lilith.thinkinginjava.unit15.coffee.Coffee;

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
	}
}