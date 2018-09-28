package com.lilith.thinkinginjava.unit17;

import java.util.PriorityQueue;
/**
 * P483
 * 深入研究容器——队列
 * PriorityQueue：优先级队列，基于compareTo()
 * @author 56580
 *
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
	static class ToDoItem implements Comparable<ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String i,char p, int s) {
			primary = p;
			secondary = s;
			item = i;
		}
		public int compareTo(ToDoItem o) {
			int i = -1;
			if(primary > o.primary){
				i = 1;
			}else if(primary == o.primary) {
				if(secondary > o.secondary) {
					i = 1;
				}else if(secondary == o.secondary) {
					i = 0;
				}
			}
			return i;
		}
		@Override
		public String toString() {
			return Character.toString(primary) + secondary + ":" + item; 
		}
	}
	public void add(String i, char p, int s) {
		super.add(new ToDoItem(i, p, s));
	}
	
	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		toDoList.add("Empty trash", 'C', 4);
		toDoList.add("Feed dog", 'A', 2);
		toDoList.add("Feed bird", 'B', 7);
		toDoList.add("Mow lawn", 'C', 3);
		toDoList.add("Water lawn", 'A', 1);
		toDoList.add("Feed cat", 'B', 1);
		while(!toDoList.isEmpty()) {
			System.out.println(toDoList.remove());
		}
	}
}
