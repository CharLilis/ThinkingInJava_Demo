package com.lilith.thinkinginjava.unit17;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import static net.mindview.util.Print.*;
/**
 * P489
 * 深入研究容器——散列与散列码
 * Map.get()是基于equals()实现的，IdentityHashMap除外，是以“==”实现的
 * @author Perform
 *
 */
public class SpringDetector {
	public static <T extends Groundhog> void detectSprint(Class<T> type) throws Exception {
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
		for(int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		print("map = " + map);
		Groundhog gh = ghog.newInstance(3);
		print("Looking up prediction for " + gh);
		if(map.containsKey(gh))
			print(map.get(gh));
		else
			print("Key not found: " + gh);
	}	
	public static void main(String[] args) throws Exception {
		detectSprint(Groundhog.class);
	}
}
