package com.lilith.thinkinginjava.unit15;
/**
 * P396
 * 泛型
 * 查看泛型中原生类型和涉及无界通配符的类型的区别
 * @author Perform
 *
 */
public class Wildcards {
	static void rawArgs(Holder holder, Object arg) {
		//Holder的泛型为任意类型
//		holder.set(arg);所以会有异常
//		holder.set(new Wildcards());同上
		
//		T t = holder.get();T未定义
		
		Object obj = holder.get();
	}
	
	static void unboundedArg(Holder<?> holder, Object arg) {
		//编译器认为？是某种类型
//		holder.set(arg);
//		holder.set(new Wildcards());?不是确切类型
		
//		T t = holder.get();
		
		Object obj = holder.get();//Object所有类型的父类
	}
	
	static <T> T exact1(Holder<T> holer) {
		//类型明确
		T t = holer.get();
		return t;
	}
	
	static <T> T exact2(Holder<T> holer, T arg) {
		//类型明确
		holer.set(arg);
		T t = holer.get();
		return t;
	}
	
	static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
		//？是T的某个子类型
//		holder.set(arg);类型没有明确
		
		T t = holder.get();
		return t;
	}
	
	static <T> void wildSupertype(Holder<? super T> holder, T arg){
		//？为T的父类
		holder.set(arg);
//		T t = holder.get();向下造型，有类型转换失败的异常
		Object obj = holder.get();
	}
	public static void main(String[] args) {
		Holder raw = new Holder<Long>();
		raw = new Holder();
		
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		
		Long lng = 1L;
		
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
//		Object r1 = exact1(raw);Warnings,raw是任何类型
		Long r6 = exact2(qualified, lng);
//		Long r7 = exact2(unbounded, lng);Error,unbounded的类型是？
//		Long r8 = exact2(bounded, lng);bounded的泛型是Long的子类型
		
//		Long r9 = wildSubtype(raw, lng);Warnings
		Long r10 = wildSubtype(qualified, lng);
//		Object r11 = wildSubtype(unbounded, lng);//体统将T认为成了Long类型，默认取小类型？
		Object r11 = wildSubtype(unbounded, new Object());
		Long r12 = wildSubtype(bounded, lng);
	
//		wildSupertype(raw, lng);Warnings
		wildSupertype(qualified, lng);
//		wildSupertype(unbounded, lng);Error
//		wildSupertype(bounded, lng);
	}
}
