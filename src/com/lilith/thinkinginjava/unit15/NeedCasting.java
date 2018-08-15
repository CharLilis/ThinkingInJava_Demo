package com.lilith.thinkinginjava.unit15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
/**
 * P402
 * 泛型—问题
 * 转型和警告
 * @author Perform
 *
 */
public class NeedCasting {
	public void f(String[] arg0) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(arg0[0]));
		//使用带有泛型类参数的转型或instanceof不会有任何效果，因为发生了擦除
		List<Widget> shapes = (List<Widget>)in.readObject();
	}
}
