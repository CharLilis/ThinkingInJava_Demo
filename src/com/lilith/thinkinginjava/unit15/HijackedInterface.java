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
class Cat extends ComparablePet implements Comparable<Cat>{
	public int compareTo(ComparablePet arg0) {
		return 0;
	}
}
