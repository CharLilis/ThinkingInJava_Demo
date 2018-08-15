package com.lilith.thinkinginjava.unit15;
/**
 * P382
 * 擦除的补偿
 * 显式工厂，直接创建类型对象，避免使用Class.newInstance()
 * @author 56580
 *
 */
public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo2(new IntegerFactory());
		new Foo2(new Widget.Factory());
	}
}
interface Factory1<T>{
	T create();
}
class Foo2<T>{
	private T t;
	public <F extends Factory1<T>> Foo2(F factory){
		factory.create();
	}
}
class IntegerFactory implements Factory1<Integer>{
	@Override
	public Integer create() {
		return new Integer(0);
	}
}
class Widget{
	public static class Factory implements Factory1<Widget>{
		@Override
		public Widget create() {
			return new Widget();
		}
	}
}