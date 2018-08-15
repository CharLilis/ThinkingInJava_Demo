package com.lilith.thinkinginjava.unit15;
/**
 * P404
 * 泛型—问题
 * 基类劫持了接口
 * @author Perform
 *
 */
public class HijackedInterface {

}
class Cat1 extends ComparablePet implements Comparable<Cat1>{
	public int compareTo(ComparablePet arg0) {
		return 0;
	}
}
