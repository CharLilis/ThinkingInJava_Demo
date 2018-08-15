package com.lilith.thinkinginjava.unit13;
/**
 * P290
 * 格式化输出
 * %d表示整数
 * %f表示浮点数
 * 用于表示小数？
 * @author Perform
 *
 */
public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		System.out.println("Row 1:[" + x + " " + y + "]");
		System.out.printf("Row 1:[%d %f]\n", x, y);
		System.out.format("Row 1:[%d %f]\n", x, y);
	}
}
