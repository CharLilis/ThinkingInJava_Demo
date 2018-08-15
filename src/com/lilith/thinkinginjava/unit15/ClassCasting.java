package com.lilith.thinkinginjava.unit15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
/**
 * P403
 * 泛型—问题
 * 转型和警告
 * @author Perform
 *
 */
public class ClassCasting {
	public void f(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
//		List<Widget> lw1= List<Widget>.class.cast(ois.readObject());
		List<Widget> lw1= List.class.cast(ois.readObject());
		
	}
}
