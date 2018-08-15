package com.lilith.thinkinginjava.unit15;

import java.util.*;
/**
 * P373
 * 泛型的擦除
 * 在泛型代码内部中，无法获得任何有关泛型参数类型的信息
 * @author Perform
 *
 */
public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkie> map = new HashMap<Frob, Fnorkie>();
		Quark<Fnorkie> quark = new Quark<Fnorkie>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				p.getClass().getTypeParameters()));
	}
}
class Frob{}
class Fnorkie{}
class Quark<Q>{}
class Particle<POSITION, MOMENTUM>{}
