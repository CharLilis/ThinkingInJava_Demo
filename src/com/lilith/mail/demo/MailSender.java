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
	
	
	public void init(String stmphost, String username, String password) {
//		pro.setProperty("mail.transport.protocol", "smtp");
		pro.setProperty("mail.smtp.auth", "true");
		pro.setProperty("mail.smtp.host", stmphost);
//		pro.put("mail.stmp.auth", "true");
//		pro.put("mail.stmp.host", stmphost);
		authenticator = new MailAuthenticator(username, password);
		session = Session.getInstance(pro, authenticator);
	}
	
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
