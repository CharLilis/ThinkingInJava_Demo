package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * P427
 * 泛型
 * @author Perform
 *
 */
public class Functional {
	public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
		Iterator<T> it = seq.iterator();
		if(it.hasNext()) {
			T result = it.next();
			while(it.hasNext()) {
				result = combiner.combine(result, it.next());
			}
			return result;
		}
		return null;
	}
	
	public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func){
		for(T t : seq) {
			func.function(t);
		}
		return func;
	}
	
	public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> func){
		List<R> result = new ArrayList<R>();
		for(T t : seq) {
			result.add(func.function(t));
		}
		return result;
	}
}
interface Combiner<T>{
	T combine(T x, T y);
}
interface UnaryFunction<R, T>{
	R function(T x);
}
interface Collector<T> extends UnaryFunction<T, T>{
	T result();
}
