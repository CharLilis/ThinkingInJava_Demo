package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P202	嵌套类
 * 写在接口中的嵌套类甚至可以实现此接口
 * @author 56580
 *
 */
public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface{
		@Override
		public void howdy() {
			Print.println("Howdy");
		}
		public static void main(String[] args) {
			Test t = new Test();
			t.howdy();
		}
	}
}
