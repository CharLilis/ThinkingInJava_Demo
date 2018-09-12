package com.lilith.mail.demo;

import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.lilith.mail.entity.MailAuthenticator;

public class MailSender {
	/*
	 * 配置文件
	 */
	private Properties pro = System.getProperties();
	
	private MailAuthenticator authenticator;
	
	private Session session;
	
	public MailSender(String stmphost, String username, String password) {
		init(stmphost, username, password);
	}
	
	/**
	 * 初始化登陆信息
	 * @param stmphost
	 * @param username
	 * @param password
	 */
	public void init(String stmphost, String username, String password) {
		//放入配置信息
//		pro.setProperty("mail.transport.protocol", "smtp");
		pro.setProperty("mail.smtp.auth", "true");
		pro.setProperty("mail.smtp.host", stmphost);
//		pro.put("mail.stmp.auth", "true");
//		pro.put("mail.stmp.host", stmphost);
		authenticator = new MailAuthenticator(username, password);
		//放入用户信息
		session = Session.getInstance(pro, authenticator);
	}
	/**
	 * 发送邮件
	 * @param recipient	目标邮箱地址
	 * @param header	标题
	 * @param context	内容正文
	 * @throws Exception
	 */
	public void sends(String recipient, String header, String context) throws Exception{
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(authenticator.getUsername()));
		message.setRecipient(RecipientType.TO, new InternetAddress(recipient));
		message.setSubject(header);
		message.setContent(context, "text/html;charset=utf-8");
		message.saveChanges();
		Transport.send(message);
	}
}
