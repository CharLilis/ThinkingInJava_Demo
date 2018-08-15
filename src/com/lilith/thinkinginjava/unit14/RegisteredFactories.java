package com.lilith.thinkinginjava.unit14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * P331
 * 注册工厂模式
 * 使用内部类实现工厂基类
 * @author Perform
 *
 */
public class RegisteredFactories {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
	}
}
/**
 * 工厂类
 * @author Perform
 *
 */
class Part{
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		//根据工厂方法生成对象
		return partFactories.get(n).create();
	}
}

class Filter extends Part{}

class FuelFilter extends Filter{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<FuelFilter>{
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<AirFilter>{
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<CabinAirFilter>{
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<OilFilter>{
		public OilFilter create() {
			return new OilFilter();
		}
	}
}

class Belt extends Part{}

class FanBelt extends Belt{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<FanBelt>{
		public FanBelt create() {
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<GeneratorBelt>{
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt{
	public static class Factory implements com.lilith.thinkinginjava.unit14.Factory<PowerSteeringBelt>{
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}
