package com.lilith.spring.entity;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//@Component
public class ExampleBean {
	private MassageBean massages;
	private String massage;
	
	public ExampleBean() {
		System.out.println("-----ExampleBean实例化-------");
	}

	public MassageBean getMassages() {
		return massages;
	}
	@Resource(name="massageBean")
	public void setMassages(MassageBean massages) {
		this.massages = massages;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
	
}
