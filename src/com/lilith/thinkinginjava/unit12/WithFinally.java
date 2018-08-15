package com.lilith.thinkinginjava.unit12;
/**
 * P266
 * finally语法块中的代码肯定会执行
 * @author Perform
 *
 */
public class WithFinally {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		try {
			sw.on();
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
		}catch (OnOffException2 e) {
			System.out.println("OnOffException2");
		}finally {
			sw.off();
		}
	}
}
