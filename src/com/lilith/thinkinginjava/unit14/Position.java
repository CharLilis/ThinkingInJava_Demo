package com.lilith.thinkinginjava.unit14;
/**
 * P342
 * 空对象的应用
 * 职位
 * @author 56580
 *
 */
public class Position {
	//职位名
	private String title;
	//人
	private Person person;
	/**
	 * 
	 * @param jobTitle
	 * @param employee
	 */
	public Position(String jobTitle, Person employee) {
		title = jobTitle;
		person = employee;
		if(person == null) {
			person = Person.Null;
		}
	}
	/**
	 * 初始化一个职位
	 * @param jobTitle
	 */
	public Position(String jobTitle) {
		title = jobTitle;
		person = Person.Null;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
		if(this.person == null) {
			this.person = Person.Null;
		}
	}
	@Override
	public String toString() {
		return "Position: " + title + " " + person;
	}
	
}
