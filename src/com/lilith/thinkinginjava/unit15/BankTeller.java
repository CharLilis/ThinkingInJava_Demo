package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
/**
 * P369
 * 匿名内部类
 * 匿名内部类在泛型中的使用 
 * @author 56580
 *
 */
public class BankTeller {
	public static void serve(Teller t, Customer c) {
		System.out.println(t + " serves " + c);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c : line) {
			serve(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}
}
class Customer{
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString(){
		return "Customer " + id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}
}
class Teller{
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	public String toString() {
		return "Teller " + id;
	}
	public static Generator<Teller> generator = new Generator<Teller>() {
			public Teller next() {
				return new Teller();
			}
		};
}
