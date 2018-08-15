package com.lilith.mail.action;

import java.net.URI;

import org.junit.Test;

import com.lilith.mail.demo.MailSender;

public class Demo01 {

	@Test
	public void testMailSend() throws Exception {
		String username = "ChenPopcorn@126.com";
		String password = "popcorn123";
		String stmpIp = "smtp.126.com";
		MailSender sender = new MailSender(stmpIp, username, password);
		sender.sends("565804861@qq.com", "测试", "你好");
	}
	
//	@Test
	public void testUrl() throws Exception {
		URI url = new URI("http://www.baidu.com");
	}
}
