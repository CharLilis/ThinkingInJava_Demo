package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Collection;

import com.lilith.thinkinginjava.unit15.coffee.Coffee;
import com.lilith.thinkinginjava.unit15.coffee.CoffeeGenerator;
/**
 * P364
 * 泛型方法的使用
 * @author 56580
 *
 */
public class Generators {
	public static <T> Collection<T> fill(Collection<T> con, Generator<T> gen, int n){
		for(int i = 0; i < n; i++) {
			con.add(gen.next());
		}
		return con;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffee){
			System.out.println(c);
		}
		Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
		for(int i : fnumbers){
			System.out.print(i + ", ");
		}
	}
}
