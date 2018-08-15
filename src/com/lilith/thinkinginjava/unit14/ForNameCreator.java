package com.lilith.thinkinginjava.unit14;

import java.util.ArrayList;
import java.util.List;
/**
 * P326
 * 
 * @author Perform
 *
 */
public class ForNameCreator extends PetCreator{
	//存放Pet类型的List
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	//指定类名
	private static String[] typeName = {
			"com.lilith.thinkinginjava.unit14.Mutt", 
			"com.lilith.thinkinginjava.unit14.Pug", 
			"com.lilith.thinkinginjava.unit14.EgyptianMau", 
			"com.lilith.thinkinginjava.unit14.Manx", 
			"com.lilith.thinkinginjava.unit14.Cymric", 
			"com.lilith.thinkinginjava.unit14.Rat", 
			"com.lilith.thinkinginjava.unit14.Mouse", 
			"com.lilith.thinkinginjava.unit14.Hamster"};
	/**
	 * 生成含有Class类型的集合
	 */
	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for(String name : typeName) {
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	static {loader();}
	/**
	 * 返回含有Class类型的集合
	 */
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
