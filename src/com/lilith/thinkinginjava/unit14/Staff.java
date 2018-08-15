package com.lilith.thinkinginjava.unit14;

import java.util.ArrayList;
/**
 * P343
 * 空对象的应用
 * 全体职员，使用arrayList来保存职工信息
 * @author Perform
 *
 */
public class Staff extends ArrayList<Position>{
	/**
	 * 添加职工
	 * @param title
	 * @param person
	 */
	public void add(String title, Person person) {
		add(new Position(title, person));
	}
	/**
	 * 添加岗位
	 * @param titles
	 */
	public void add(String... titles) {
		for(String title : titles) {
			add(new Position(title));
		}
	}
	/**
	 * 初始化全体职工信息
	 * @param titles
	 */
	public Staff(String... titles) {
		add(titles);
	}
	/**
	 * 检查岗位是否没有人
	 * @param title
	 * @return
	 */
	public boolean positionAvailable(String title) {
		for(Position position : this) {
			if(position.getTitle().equals(title) && position.getPerson() == Person.Null) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 更新职员信息，如果该职位有人则抛运行异常
	 * @param title
	 * @param hire
	 */
	public void fillPosition(String title, Person hire) {
		for(Position position : this) {
			if(position.getTitle().equals(title) && position.getPerson() == Person.Null) {
				position.setPerson(hire);
				return;
			}
		}
		throw new RuntimeException("Position " + title + " not available");
	}
	public static void main(String[] args) {
		//初始化公司职位信息
		Staff staff = new Staff("President","CTO",
				"Marketing Manager","Product Manager",
				"Project Lead", "Software Engineer",
				"Software Engineer", "Software Engineer",
				"Software Engineer", "Test Engineer",
				"Technical Writer");
		staff.fillPosition("President",
				new Person("Me", "Last", "The Top, Lonely At"));
		staff.fillPosition("Project Lead", 
				new Person("Janet", "Planner", "The Burbs"));
		if(staff.positionAvailable("Software Engineer"))
			staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "Bright Light City"));
		System.out.println(staff);
	}
}
