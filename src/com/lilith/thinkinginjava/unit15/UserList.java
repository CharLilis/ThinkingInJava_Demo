package com.lilith.thinkinginjava.unit15;

import java.util.List;
/**
 * P403
 * 泛型-重载
 * @author Perform
 *
 * @param <W>
 * @param <T>
 */
public class UserList<W, T> {
	void f(List<W> v) {}
	//发生擦除
//	void f(List<T> v) {}Error
}
