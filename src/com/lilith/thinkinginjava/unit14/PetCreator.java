package com.lilith.thinkinginjava.unit14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * P325
 * @author Perform
 *
 */
public abstract class PetCreator {
	private Random rand = new Random(47);
	public abstract List<Class<? extends Pet>> types();
	/**
	 * 随机实例化对象
	 * @return
	 */
	public Pet randomPet() {
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * 创建指定长度、Pet类型的数组，并实例化数组中的元素
	 * @param size
	 * @return
	 */
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for(int i = 0; i < size; i++) {
			result[i] = randomPet();
		}
		return result;
	}
	/**
	 * 将数组转换成List
	 * @param size
	 * @return
	 */
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
}
