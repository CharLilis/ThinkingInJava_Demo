package com.lilith.thinkinginjava.unit10.controller;

import java.util.ArrayList;
import java.util.List;
/**
 * P208	模板模式
 * 控制器
 * 实现固定算法
 * @author 56580
 *
 */
public class Controller {
	private List<Event> events = new ArrayList<Event>();
	public void add(Event e) {
		events.add(e);
	}
	public void run() {
		while(events.size() > 0) {
			for(Event e : new ArrayList<Event>(events)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					events.remove(e);
				}
			}
		}
	}
}
