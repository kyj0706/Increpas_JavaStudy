package mymain;

import myutil.MyDate;

public class MyMain_MyDate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//			��ü����
		MyDate in = new MyDate();
		
		//public : ����
		in.year =2022;
		
		//protected : �ڽ� �� ������Ű��
		//in.month = 10;
		in.setMonth(10);
		
		//private : �����(�ڱ��ڽŸ� ��밡��)
		//in.day =12;
		in.setDay(12);
		
		
		//defualt : ������Ű��
		//in.weekday = 4;
		in.setWeekday(4);
		
		in.display();
		
		//public 
		int year = in.year;
		
		int month = in.getMonth();
		
		int day = in.getDay();
		
		int weekday =in.getWeekday();
		
		System.out.printf("%d��%d��%d�� %d����\n", year,month,day,weekday);
		
	}

}
