package com.lilith.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 生成验证码
 * 		位数固定，遮挡线数量固定
 * @author Perform
 *
 */
public class ValidataCode extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建空白图片
		BufferedImage image = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		//获得图片的画笔
		Graphics g = image.getGraphics();
		Random r = new Random();
		//设置画笔属性
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		
		g.fillRect(0, 0, 100, 30);
		
		String number = getNumber(6);
		System.out.println(number);
		HttpSession session = request.getSession();
		session.setAttribute("validata", number);
		
		g.setColor(new Color(0, 0, 0));
		g.setFont(new Font(null, Font.BOLD, 24));
		g.drawString(number, 5, 25);
		for(int i = 0; i < 8; i++) {
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100), r.nextInt(30));
		}
		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpeg", out);
		out.close();
	}
	
	private String getNumber(int size) {
		String number = "";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random r = new Random();
		for(int i = 0; i < size; i++) {
			number += str.charAt(r.nextInt(str.length()));
		}
		return number;
	}
}
