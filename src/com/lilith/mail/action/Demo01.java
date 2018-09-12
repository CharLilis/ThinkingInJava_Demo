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
		//用户名
		String username = "";
		//密码
		String password = "";
		//目标邮箱
		String clentEmail = "";
		//邮件服务器地址
		String stmpIp = "smtp.126.com";
		MailSender sender = new MailSender(stmpIp, username, password);
		sender.sends(clentEmail, "测试", "你好");
	}
	
}
