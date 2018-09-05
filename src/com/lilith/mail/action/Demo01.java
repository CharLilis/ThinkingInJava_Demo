package com.lilith.mail.action;

import java.net.URI;

import org.junit.Test;

import com.lilith.mail.demo.MailSender;
/**
 * 邮件
 * 测试类
 * @author Perform
 *
 */
public class Demo01 {

	@Test
	public void testMailSend() throws Exception {
		String username = "";
		String password = "";
		String stmpIp = "smtp.126.com";
		MailSender sender = new MailSender(stmpIp, username, password);
		sender.sends("", "测试", "你好");
	}
	
//	@Test
	public void testUrl() throws Exception {
		URI url = new URI("http://www.baidu.com");
	}
}
