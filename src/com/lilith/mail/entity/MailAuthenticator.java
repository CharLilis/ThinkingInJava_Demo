package com.lilith.mail.entity;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator{
	/*
	 *	用户名 
	 */
	private String username;
	/*
	 * 密码
	 */
	private String password;
	
	/**
	 * 初始化
	 * @param username
	 * @param password
	 */
	public MailAuthenticator(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
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
	
}
