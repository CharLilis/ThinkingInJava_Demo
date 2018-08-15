package com.lilith.thinkinginjava.unit15;
/**
 * P399
 * 捕获转换
 * @author 56580
 *
 */
public class CaptureConversion {
	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	static void f2(Holder<?> holder) {
		f1(holder);
	}
	
	public static void main(String[] args) {
		Holder raw = new Holder<Integer>(1);
//		f1(raw);Warnings 类型不明确
		f2(raw);
		
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		f2(rawBasic);//No Warnings
		
		Holder<?> wilcarded = new Holder<Double>(1.0);
		f2(wilcarded);
	}
}
