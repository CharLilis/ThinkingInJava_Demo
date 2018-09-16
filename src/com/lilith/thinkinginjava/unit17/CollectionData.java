package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;

import com.lilith.thinkinginjava.unit15.Generator;
/**
 * P461
 * 深入研究容器——填充容器
 * @author 56580
 *
 * @param <T>
 */
public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen, int size) {
		for(int i = 0; i < size; i++) {
			add(gen.next());
		}
	}
	
	public static <T> CollectionData<T> list(Generator<T> gen, int size){
		return new CollectionData<T>(gen, size);
	}
}
