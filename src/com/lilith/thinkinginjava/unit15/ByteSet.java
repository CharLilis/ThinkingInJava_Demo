package com.lilith.thinkinginjava.unit15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * P400
 * 泛型-类型
 * 任何基本类型都不能做为类型参数
 * @author Perform
 *
 */
public class ByteSet {
	Byte[] possibles = {1,2,3,4,5,6,7,8,9};
	Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
	//自动包装机制不能解决所有情况
//	Set<Byte> mySet2 = new HashSet<Byte>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
}
