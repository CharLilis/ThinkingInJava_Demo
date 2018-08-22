package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * P423
 * 泛型——对缺乏潜在类型机制的补偿
 * 如果没有正确的接口，就使用基类来做泛化。
 * @author Perform
 *
 */
public class Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> type, int size) {
		try {
			for(int i = 0; i < size; i++) {
				collection.add(type.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Contract {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getName() + " " + id;
	}
}
class TitleTransfer extends Contract{}
class FillTest{
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for(Contract c : contracts) {
			System.out.println(c);
		}
		SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();
		//SimpleQueue的父类不包含Collection
//		Fill.fill(contractQueue, Contract.class, 3);
	}
}