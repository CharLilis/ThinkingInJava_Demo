package com.lilith.thinkinginjava.unit16;

import java.util.Random;

import com.lilith.thinkinginjava.unit15.Generator;

public class RandomGenerator {
	private static Random r = new Random(47);
	public static class Boolean implements Generator<java.lang.Boolean>{
		public java.lang.Boolean next() {
			return r.nextBoolean();
		}
	}
	public static class Byte implements Generator<java.lang.Byte>{
		public java.lang.Byte next() {
			return (byte)r.nextInt();
		}
	}
	public static class Character implements Generator<java.lang.Character>{
		public java.lang.Character next() {
			return CountingGenerator.chars[r.nextInt(CountingGenerator.chars.length)];
		}
	}
	public static class String extends CountingGenerator.String{
		{cg = new Character();}
		public String() {}
		public String(int size) {
			super(size);
		}
	}
	public static class Short implements Generator<java.lang.Short>{
		public java.lang.Short next() {
			return (short)r.nextInt();
		}
	}
	public static class Integer implements Generator<java.lang.Integer>{
		private int mod = 1000;
		public Integer() {}
		public Integer(int mod) {
			this.mod = mod;
		}
		public java.lang.Integer next() {
			return r.nextInt(mod);
		}
	}
	public static class Float implements Generator<java.lang.Float>{
		public java.lang.Float next() {
			int trimmed = Math.round(r.nextFloat() * 100);
			return ((float)trimmed) / 100;
		}
	}
	public static class Double implements Generator<java.lang.Double>{
		public java.lang.Double next() {
			int trimmed = Math.round(r.nextFloat() * 100);
			return ((double)trimmed) / 100;
		}
	}
}
