package com.lilith.thinkinginjava.unit15;
/**
 * P356
 * 测试元组的使用
 * @author Perform
 *
 */
public class TupleTest {
	static TwoTuple<String,Integer> f(){
		return new TwoTuple<String, Integer>("h1", 47);
	}
	static ThreeTuple<Amphibian, String, Integer> g(){
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "h1", 47);
	}
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "h1", 47);
	}
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "h1", 47, 11.1);
	}	
	public static void main(String[] args) {
		TwoTuple<String, Integer> tts1 = f();
		System.out.println(tts1);
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
}
class Amphibian{}
class Vehicle{}
