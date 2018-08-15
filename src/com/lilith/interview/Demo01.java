package com.lilith.interview;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int year = Integer.valueOf(sca.next());
		int month = Integer.valueOf(sca.next());
		int day = Integer.valueOf(sca.next());
		//总天数
		int days = 0;
		if(month < 2) {
			days = day;
		}else {
			//单独计算二月份的天数
			int month_Feb_Day = 0; 
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				month_Feb_Day = 29;
			}else {
				month_Feb_Day = 28;
			}
			
			//计算天数
			switch (month) {
			case 11:
				days += 31;
			case 10:
				days += 30;
			case 9:
				days += 31;
			case 8:
				days += 31;
			case 7:
				days += 30;
			case 6:
				days += 31;
			case 5:
				days += 30;
			case 4:
				days += 31;
			case 3:
				days += month_Feb_Day;
			default:
				days += 31 + day;
			}
			day = days;
		}
		System.out.println("共有"+day+"天");
	}
}
