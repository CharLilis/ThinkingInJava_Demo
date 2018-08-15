package com.lilith.thinkinginjava.unit14;
/**
 * P331
 * 工厂模式的基类
 * 限制子类的返回类型
 * @author Perform
 *
 * @param <T>
 */
public interface Factory<T> {
	T create();
}
