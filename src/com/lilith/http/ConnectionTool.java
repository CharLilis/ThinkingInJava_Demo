package com.lilith.http;

import java.io.*;
import java.net.*;
import java.util.*;

import net.sf.json.JSONObject;

public class ConnectionTool {
	public static void main(String[] args) {
		Map<String, String> paramMap = new HashMap<String, String>();
		String urlAddress = "";
		String apiName = "";
		String requestMethod = "";
		String charsetName = "UTF-8";
		String requestMsg = "";
		String responseMsg = "";
		//CSBQCIBT
//		urlAddress = "http://106.14.1.40:8086?third_id_type=01&client_serial_no=CMS180614000000013&channel_no=1&third_id=122";
//		apiName = "com.fbank.middle.member.queryCustInfoByThird";
//		requestMethod = "POST";
//		requestMsg = "{\"third_id_type\":\"01\",\"third_id\":\"122\",\"channel_no\":\"1\",\"client_serial_no\":\"CMS180614000000013\"}";
		//CSBEAQ
//		urlAddress = "http://106.14.1.40:8086?channel_no=801001&client_serial_no=2017111115155&cust_no=3000000000346639&acct=&merchant_no=8808000000337524";
//		apiName = "com.fbank.middle.account.eleAcctQuery";
//		requestMethod = "GET";
//		requestMsg = "{\"merchant_no\":\"8808000000337524\",\"acct\":\"\",\"cust_no\":\"3000000000346639\",\"channel_no\":\"801001\",\"client_serial_no\":\"2017111115155\"}";
		//CSB020401
//		urlAddress = "http://106.14.1.40:8086";
//		apiName = "com.fbank.risk.portal.scene";
//		requestMethod = "POST";
//		requestMsg = "{\"header\":{\"scene\":\"050801\",\"sourceIp\":\"192.168.2.26\",\"platform\":\"WEB\",\"riskDate\":\"2023-06-25 03:33:52\"},\"body\":{\"productNo\":\"1010040\",\"applyId\":\"23062500022000000004\",\"companyCodeType\":\"Ent01\",\"companyCode\":\"12169808-9\",\"loanAmount\":\"100000.0\",\"authContactNo\":\"\",\"platformUid\":\"\",\"companyName\":\"XX\",\"dateOfEstablishment\":\"\",\"businessStartDate\":\"\",\"businessEndDate\":\"\",\"businessProvince\":\"\",\"businessCity\":\"\",\"businessArea\":\"\",\"businessDetailAddr\":\"\",\"businessLocationName\":\"\",\"businessPhoneNo\":\"\",\"legalPersonName\":\"EEE\",\"legalPersonId\":\"124dw6e-3\",\"legalPersonIdStartDate\":\"\",\"legalPersonIdEndDate\":\"\",\"legalPersonMobile\":\"1325235236\",\"education\":\"\",\"marriage\":\"\",\"email\":\"\",\"qqNumber\":\"\",\"residentProvince\":\"\",\"residentCity\":\"\",\"residentArea\":\"\",\"residentDetailAddr\":\"\",\"fingerprintMark\":\"\",\"acctNo\":\"\",\"cardNumber\":\"\",\"contactList\":[],\"extInfo\":{\"corpCustomerCode\":\"1111111\",\"corpType\":\"报关行\",\"registerMobile\":\"152324345\",\"dailyTaxAmount\":\"1212412455.7\",\"dailyTaxCount\":\"1322\",\"customerCreditLevel\":\"0\"}}}";
		//个人借款
//		urlAddress = "http://106.14.1.40:8086";
//		apiName = "com.fbank.risk.portal.scene";
//		requestMethod = "POST";
//		requestMsg = "{\"header\":{\"scene\":\"060501\",\"sourceIp\":\"192.168.2.26\",\"platform\":\"WEB\",\"riskDate\":\"2026-05-01 02:17:04\"},\"body\":{\"applyId\":\"26050100000000000103\",\"productNo\":\"11405611\",\"acctNo\":\"\",\"userName\":\"戴定宽\",\"idNumber\":\"500226198604072259\",\"mobile\":\"13488888811\",\"cardAccountName\":\"\",\"cardNumber\":\"\",\"loanPurpose\":\"01\",\"repaymentMethod\":\"01\",\"repaymentPeriod\":\"24\",\"dayRate\":\"0.02722\",\"loanAmount\":\"10000.0\",\"fingerprintMark\":\"\",\"noPaidAmount\":\"0.0\"}}";
		//CSB020501
//		urlAddress = "http://106.14.1.40:8086";
//		apiName = "com.fbank.risk.portal.scene";
//		requestMethod = "POST";
//		requestMsg = "{\"header\":{\"scene\":\"050501\",\"sourceIp\":\"192.168.20.119\",\"platform\":\"WEB\",\"riskDate\":\"2018-06-14 09:14:09\"},\"body\":{\"applyId\":\"0\",\"productNo\":\"8010110002\",\"acctNo\":\"1\",\"uid\":\"3\",\"enterpriseUid\":\"7\",\"mobile\":\"8\",\"authContactNo\":\"6\",\"platformUid\":\"9\",\"platformOrderId\":\"0\",\"userName\":\"8\",\"idNumber\":\"2\",\"cardAccountName\":\"1\",\"cardNumber\":\"2\",\"loanPurpose\":\"3\",\"repaymentMethod\":\"4\",\"repaymentPeriod\":\"2.0\",\"dayRate\":\"3.0\",\"loanAmount\":\"4.0\",\"fingerprintMark\":\"2\",\"merchantNo\":\"8\"}}";
		//CSB020801
//		urlAddress = "http://106.14.1.40:8086";
//		apiName = "com.fbank.risk.portal.scene";
//		requestMethod = "POST";
//		requestMsg = "{\"header\":{\"scene\":\"020801\",\"sourceIp\":\"192.168.20.119\",\"platform\":\"WEB\",\"riskDate\":\"2018-06-23 16:40:52\"},\"body\":{\"productNo\":\"1\",\"applyId\":\"18062300000000000002\",\"companyCodeType\":\"4\",\"companyCode\":\"5\",\"loanAmount\":\"7.0\",\"authContactNo\":\"6\",\"platformUid\":\"9\",\"companyName\":\"6\",\"dateOfEstablishment\":\"9\",\"businessStartDate\":\"0\",\"businessEndDate\":\"1\",\"enterpriseUid\":\"7\",\"businessProvince\":\"2\",\"businessCity\":\"3\",\"businessArea\":\"4\",\"businessDetailAddr\":\"6\",\"businessLocationName\":\"7\",\"businessPhoneNo\":\"5\",\"education\":\"2\",\"marriage\":\"3\",\"email\":\"3\",\"qqNumber\":\"9\",\"residentProvince\":\"4\",\"residentCity\":\"5\",\"residentArea\":\"5\",\"residentDetailAddr\":\"5\",\"fingerprintMark\":\"2\",\"acctNo\":\"1\",\"uid\":\"3\",\"userName\":\"8\",\"idNumber\":\"2\",\"cardNumber\":\"8\",\"contactList\":[{\"relation\":\"01\",\"name\":\"我爱学习(\\u2032▽`??) ??? \",\"mobile\":\"12342456783\"},{\"relation\":\"02\",\"name\":\"(`?\\u2032)我明明刚放假啊！\",\"mobile\":\"12468346803\"},{\"relation\":\"03\",\"name\":\"(?ó﹏ò?)非义务教育可以选修咩\",\"mobile\":\"12346374746\"}],\"mobile\":\"8\"}}";
		
		//个人授信申请
		urlAddress = "http://106.14.1.40:8086";
		apiName = "com.fbank.risk.portal.scene";
		requestMethod = "POST";
		requestMsg = "{\"header\":{\"scene\":\"060401\",\"sourceIp\":\"192.168.20.119\",\"platform\":\"WEB\",\"riskDate\":\"2018-07-16 14:14:07\"},\"body\":{\"productNo\":\"11405611\",\"applyId\":\"18071600000003201121\",\"authContactNo\":\"测试\",\"acctNo\":\"测试\",\"userName\":\"宝德富民测试\",\"sex\":\"00\",\"idNumber\":\"440606199005106394\",\"idValidDate\":\"20491206\",\"hasDriverLicense\":\"是\",\"mobile\":\"13144444444\",\"monthlyIncome\":\"1200000.0\",\"education\":\"2\",\"marriage\":\"1\",\"email\":\"\",\"qqNumber\":\"\",\"hukouProvince\":\"\",\"hukouCity\":\"\",\"hukouArea\":\"\",\"hukouDetailAddr\":\"\",\"residentProvince\":\"北京\",\"residentCity\":\"北京市\",\"residentArea\":\"朝阳区\",\"residentDetailAddr\":\"望京soho\",\"fingerprintMark\":\"\",\"housingCondition\":\"\",\"industry\":\"\",\"employerType\":\"\",\"employerName\":\"\",\"employerProvince\":\"\",\"employerCity\":\"\",\"employerArea\":\"\",\"employerDetailAddr\":\"\",\"cardNumber\":\"\",\"contactList\":[{\"relation\":\"4\",\"name\":\"联系人1\",\"mobile\":\"15312481515\"},{\"relation\":\"0\",\"name\":\"联系人2\",\"mobile\":\"15321046464\"}],\"carOwnerInfo\":{\"carBrandAndModel\":\"\",\"carLicense\":\"\",\"buyDate\":\"\",\"driverLicense\":\"\",\"carUsage\":\"\"},\"recommendedAmount\":\"87460.0\",\"extInfo\":{\"relationDFl\":\"本人\",\"driverName\":\"宝德富民测试\",\"driverType\":\"C1小型汽车\",\"carModel\":\"别克君威 2015款 2.0L 领先时尚型 前置前驱 2.0L 1.59吨 市场价17.89万\",\"carPlateNumber\":\"\",\"engineNo\":\"123456789\",\"carIdentify\":\"LFVBA11J363006992\",\"purpose\":\"家庭自用\",\"carMiles\":\"30000\",\"salePrice\":\"12000000\",\"loanAmount\":\"8746000.0\",\"loanPeriods\":\"\",\"gpsLevel\":\"1档\",\"comRate\":\"5.1\",\"secureFee\":\"0\",\"dealerName\":\"宝德富民测试车商\",\"dealerCity\":\"重庆渝北区\",\"dealerId\":\"1\",\"belongSale\":\"宝德富民测试经办人\",\"saleCity\":\"重庆渝北区\",\"saleId\":\"1\",\"carPrice\":\"12000000\",\"comment\":\"\"}}}";
					
		
		paramMap.put("signdata", "lksldfksf");
		paramMap.put("Connection", "keep-alive");
		paramMap.put("Accept-Language", "zh-CN,zh;q=0.8");
		paramMap.put("Content-Type",
				"application/json; charset=utf-8");
		paramMap.put("Accept", "*/*");
		paramMap.put("signdate", "");
		paramMap.put("_api_version", "1.0.0");
		paramMap.put("_api_signature", "rtid");
		paramMap.put("_api_name", apiName);
		paramMap.put("_api_access_key", "ak");
		paramMap.put("_api_timestamp",
				System.currentTimeMillis() + "");

		paramMap.put(
				"User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.803.0 Safari/535.1");
		
		System.out.println(paramMap);
		
//		JSONObject json = new JSONObject();
//		json.put("third_id_type", "01");
//		json.put("third_id", "obfsxw4E45xJAxUVuZgFMfOwApqU");
//		json.put("channel_no", "801001");
//		json.put("client_serial_no", "2018061100000003");
//		json.put("merchant_no", "123");
//		json.put("acct", "83843");
//		json.put("cust_no", "3994");
//		json.put("channel_no", "87234");
//		json.put("client_serial_no", "9923");
//		requestMsg = json.toString();
		System.out.println("请求报文：" + requestMsg);
		
		OutputStream out = null;
		BufferedReader br = null;
		HttpURLConnection con = null;
		try {
			URL url = new URL(urlAddress);
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod(requestMethod);
			con.setReadTimeout(55555);
			con.setConnectTimeout(5000);
			for(Map.Entry<String, String> entry : paramMap.entrySet()) {
				con.setRequestProperty(entry.getKey(), entry.getValue());
			}
			con.setDoOutput(true);
			con.setDoInput(true);
			out = con.getOutputStream();
			out.write(requestMsg.getBytes(charsetName));
			out.flush();
			
			br = new BufferedReader(new InputStreamReader(con.getInputStream(), charsetName));
			String line = "";
			StringBuffer sb = new StringBuffer();
			boolean fristLine = true;
			while((line = br.readLine()) != null) {
				if(fristLine) {
					fristLine = false;
				}else {
					sb.append("\n");
				}
				sb.append(line);
			}
			responseMsg = sb.toString();
			System.out.println("发送成功，收到的报文是：" + responseMsg);
		} catch (Exception e) {
			System.out.println("发送失败：" + e.getMessage());
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				con.disconnect();
			}
		}
	}
}
