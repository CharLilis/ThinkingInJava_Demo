package com.lilith.thinkinginjava.unit17;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
	static class ToDoItem implements Comparable<ToDoItem>{

		public int compareTo(ToDoItem o) {
			return 0;
		}
	}
}
