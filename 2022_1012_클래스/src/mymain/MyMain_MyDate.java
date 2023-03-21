package mymain;

import myutil.MyDate;

public class MyMain_MyDate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//			객체생성
		MyDate in = new MyDate();
		
		//public : 공개
		in.year =2022;
		
		//protected : 자식 및 동일패키지
		//in.month = 10;
		in.setMonth(10);
		
		//private : 비공개(자기자신만 사용가능)
		//in.day =12;
		in.setDay(12);
		
		
		//defualt : 동일패키지
		//in.weekday = 4;
		in.setWeekday(4);
		
		in.display();
		
		//public 
		int year = in.year;
		
		int month = in.getMonth();
		
		int day = in.getDay();
		
		int weekday =in.getWeekday();
		
		System.out.printf("%d년%d월%d일 %d요일\n", year,month,day,weekday);
		
	}

}
