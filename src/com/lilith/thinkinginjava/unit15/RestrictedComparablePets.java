package com.lilith.thinkinginjava.unit15;
/**
 * P404
 * 泛型-问题
 * 基类劫持了接口
 * @author Perform
 *
 */
public class RestrictedComparablePets {

}
class Hamster extends ComparablePet implements Comparable<ComparablePet>{
	@Override
	public int compareTo(ComparablePet arg0) {
		return 0;
	}
}
class Gecko extends ComparablePet{
	@Override
	public int compareTo(ComparablePet arg0) {
		return 0;
	}
}
