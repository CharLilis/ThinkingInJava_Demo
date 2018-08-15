package com.lilith.thinkinginjava.unit14;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter() {
//			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		
		public void count(Pet pet) {
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				if(pair.getKey().isInstance(pet)) {
					put(pair.getKey(), pair.getValue() + 1);
				}
			}
		}
		
		@Override
		public String toString() {
			StringBuilder result = new StringBuilder("{");
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
			}
			return super.toString();
		}
	}
}
