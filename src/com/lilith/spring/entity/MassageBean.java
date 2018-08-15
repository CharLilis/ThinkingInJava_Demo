package com.lilith.spring.entity;

import java.util.Map;
import java.util.Set;

public class MassageBean {
	private String moduleName;
	private int pageSize;
	private String username;
	private String password;
	
	private Set<String> usernames;
	private Map<String, String> maps;
	
	public MassageBean() {
		System.out.println("------------MassageBean实例化------------");
	}
	
	public MassageBean(String moduleName, int pageSize, String username, String password) {
		this.moduleName = moduleName;
		this.pageSize = pageSize;
		this.username = username;
		this.password = password;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getUsernames() {
		return usernames;
	}

	public void setUsernames(Set<String> usernames) {
		this.usernames = usernames;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
}
