package com.lilith.thinkinginjava.unit17;
/**
 * P500
 * 深入研究容器——选择接口的不同实现
 * 测试数据的一些属性
 * @author 56580
 *
 */
public class TestParam {
	//长度
	public final int size;
	//循环次数
	public final int loops;
	public TestParam(int size, int loops) {
		this.size = size;
		this.loops = loops;
	}
	public static TestParam[] array(int ...values) {
		int size = values.length/2;
		TestParam[] params = new TestParam[size];
		int n = 0;
		for(int i = 0; i < size; i++) {
			params[i] = new TestParam(values[n++], values[n++]);
		}
		return params;
	}
	public static TestParam[] array(String[] values) {
		int[] params = new int[values.length];
		for(int i = 0; i < values.length; i++) {
			params[i] = Integer.decode(values[i]);
		}
		return array(params);
	}
}
