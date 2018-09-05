package com.lilith.thinkinginjava.unit16;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;
/**
 * 返回指定类型的数组
 * @author 56580
 *
 */
public class Generated {
	public static <T> T[] array(T[] a, Generator<T> gen) {
		return new CollectionData<T>(gen, a.length).toArray(a);
	}
	
	@SuppressWarnings("unchecked")	
	public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
		T[] a = (T[])java.lang.reflect.Array.newInstance(type, size);
		return new CollectionData<T>(gen, size).toArray(a);
	}
}
