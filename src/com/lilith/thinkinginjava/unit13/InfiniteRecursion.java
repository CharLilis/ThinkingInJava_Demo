package com.lilith.thinkinginjava.unit13;

import java.util.ArrayList;
import java.util.List;
/**
 * P287	无意识的递归
 * 加号后面跟着了this，jvm会自动将其转为String对象，发生了递归调用
 * 可以使用supper.toString()
 * @author Perform
 *
 */
public class InfiniteRecursion {
	/**
	 * 打印对象的内存地址
	 */
	public String toString() {
		return "InfiniteRecursion address:"+ this +"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> l = new ArrayList<InfiniteRecursion>();
		for(int i = 0; i < 10; i++) {
			l.add(new InfiniteRecursion());
		}
		System.out.println(l);
	}
}
