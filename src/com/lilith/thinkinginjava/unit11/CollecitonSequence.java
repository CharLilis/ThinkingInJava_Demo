package com.lilith.thinkinginjava.unit11;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.lilith.thinkinginjava.unit14.Pet;
import com.lilith.thinkinginjava.unit14.Pets;
/**
 * 实现自定义容器
 * @author Perform
 *
 */
public class CollecitonSequence extends AbstractCollection<Pet>{
	private Pet[] pets = Pets.createArray(8);
	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}
			@Override
			public Pet next() {
				return pets[index++];
			}
			@Override
			public void remove() {
				Iterator.super.remove();
			}
		};
	}

	@Override
	public int size() {
		return pets.length;
	}

}
