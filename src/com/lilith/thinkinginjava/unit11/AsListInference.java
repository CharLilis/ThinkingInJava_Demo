package com.lilith.thinkinginjava.unit11;

import java.util.Arrays;
import java.util.List;

/**
 * P221	添加元素
 * @author 56580
 *
 */
public class AsListInference {
	public static void main(String[] args) {
		List<Snow> lists = Arrays.asList(new Powder(), new Crusty(), new Slush());
		List<Snow> lists2 = Arrays.asList(new Light(), new Heavy());
		
	}
}
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}