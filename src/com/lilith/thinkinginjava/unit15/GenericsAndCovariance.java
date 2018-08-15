package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.List;

/**
 * P391
 * 通配符
 * 使用通配符实现数组的协变性
 * @author Perform
 *
 */
public class GenericsAndCovariance {
	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Apple>();
//		flist.add(new Apple());
//		flist.add(new Fruit());
//		flist.add(new Object());
		flist.add(null);
		Fruit f = flist.get(0); 
	}
}
