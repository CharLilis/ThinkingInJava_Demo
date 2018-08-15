package com.lilith.http;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.aspectj.util.UtilClassLoader;
import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

public class CurlSimulation {
	public static void main(String[] args) {
		
		String urlAddress = "";
		String apiName = "";
		String requestMethod = "";
		String charsetName = "UTF-8";
		String requestMsg = "";
		String responseMsg = "";
		//CSBQCIBT
		urlAddress = "http://106.14.1.40:8086?channel_no=801001&client_serial_no=2017111115155&cust_no=3000000000346639&acct=&merchant_no=8808000000337524";
		apiName = "com.fbank.middle.account.eleAcctQuery";
		requestMethod = "GET";
		
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("Postman-Token", "ffc74f06-4c48-43f1-aef3-a213da3b3fba");
		paramMap.put("Content-Type", "application/octet-stream");
		paramMap.put("Cache-Control", "no-cache");
		paramMap.put("_api_version", "1.0.0");
		paramMap.put("_api_signature", "rtid");
		paramMap.put("_api_name", apiName);
		paramMap.put("_api_access_key", "ak");
		paramMap.put("_api_timestamp", System.currentTimeMillis() + "");

//		HttpClient httpClient = new HttpClient();// 客户端实例化
//		GetMethod getMethod = new GetMethod(urlAddress);
//		//插入请求头
//		for(Map.Entry<String, String> entry : paramMap.entrySet()) {
//			getMethod.setRequestHeader(entry.getKey(), entry.getValue());
//		}
		
		try {
//			RequestEntity requestEntity = new ByteArrayRequestEntity(requestMsg.getBytes("UTF-8"));
//			getMethod.setRequestEntity(requestEntity);
//			httpClient.executeMethod(getMethod);// 执行请求
//			InputStream soapResponseStream = getMethod.getResponseBodyAsStream();// 获取返回的流
//			StringBuffer sb = new StringBuffer();
//			String line;
//			// 从输入流中读取数据
//			BufferedReader br = new BufferedReader(new InputStreamReader(soapResponseStream));
//			while((line = br.readLine()) != null) {
//				sb.append(line);
//			}
//			// 打印返回结果
//			System.out.println(sb.toString());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		HttpClient httpClient = new HttpClient();// 客户端实例化
		GetMethod getMethod = new GetMethod(urlAddress);
		
		HttpConnectionManagerParams managerParams = httpClient 
				   .getHttpConnectionManager().getParams(); 
		// 设置连接超时时间(单位毫秒) 
		managerParams.setConnectionTimeout(9000); 
	// 设置读数据超时时间(单位毫秒) 
	managerParams.setSoTimeout(12000); 
//		PostMethod postMethod = new PostMethod("");
		//插入请求头
		for(Map.Entry<String, String> entry : paramMap.entrySet()) {
			getMethod.setRequestHeader(entry.getKey(), entry.getValue());
		}
//		RequestEntity requestEntity = new ByteArrayRequestEntity(requestMsg.getBytes("UTF-8"));
//		postMethod.setRequestEntity(requestEntity);
		
		try {
			httpClient.executeMethod(getMethod);// 执行请求
			InputStream soapResponseStream = getMethod.getResponseBodyAsStream();// 获取返回的流
			StringBuffer sb = new StringBuffer();
			String line;
			// 从输入流中读取数据
			BufferedReader br = new BufferedReader(new InputStreamReader(soapResponseStream, "UTF-8"));
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			// 打印返回结果
			System.out.println(sb.toString());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	@Test
	public void test02() {
		try {
			HttpResponse<String> response = Unirest.get("http://106.14.1.40:8086?channel_no=801001&client_serial_no=2017111115155&cust_no=3000000000346639&acct=&merchant_no=8808000000337524")
					  .header("_api_version", "1.0.0")
					  .header("_api_signature", "rtid")
					  .header("_api_name", "com.fbank.middle.account.eleAcctQuery")
					  .header("_api_access_key", "ak")
					  .header("_api_timestamp", "1481095868356")
					  .header("Cache-Control", "no-cache")
					  .header("Postman-Token", "6747d614-ec3b-4bc0-84ec-50d206ec1c37")
//				  .body("{\n\t\"acct\" : \"11122222\"\n}")
					  .asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test01() {
//		OkHttpClient client = new OkHttpClient();
//
//		MediaType mediaType = MediaType.parse("application/octet-stream");
//		RequestBody body = RequestBody.create(mediaType, "{\n\t\"acct\" : \"11122222\"\n}");
//		Request request = new Request.Builder()
//		  .url("http://106.14.1.40:8086?channel_no=801001&client_serial_no=2017111115155&cust_no=3000000000346639&acct=&merchant_no=8808000000337524")
//		  .get()
//		  .addHeader("_api_version", "1.0.0")
//		  .addHeader("_api_signature", "rtid")
//		  .addHeader("_api_name", "com.fbank.middle.account.eleAcctQuery")
//		  .addHeader("_api_access_key", "ak")
//		  .addHeader("_api_timestamp", "1481095868356")
//		  .addHeader("Cache-Control", "no-cache")
//		  .addHeader("Postman-Token", "ffc74f06-4c48-43f1-aef3-a213da3b3fba")
//		  .build();
//
//		Response response = client.newCall(request).execute();
	}
}
