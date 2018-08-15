package com.lilith.thinkinginjava.unit15;

import java.util.*;

import com.lilith.thinkinginjava.unit14.Person;
import com.lilith.thinkinginjava.unit14.Pet;

import net.mindview.util.New;
/**
 * P363
 * 当使用泛型方法做参数时，不会进行类型检查
 * New.map()的返回值是Map<K, V>
 * @author 56580
 *
 */
public class LimitsOfInference {
	static void f(Map<Person, List<Pet>> petPeople){}
	public static void main(String[] args) {
		//程序未报错，没有进行类型检查
		f(New.map());
		//可以写成显示的类型说明
		f(New.<Person, List<Pet>>map());
	}
}
