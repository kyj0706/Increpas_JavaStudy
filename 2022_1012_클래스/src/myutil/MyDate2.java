package myutil;

import java.util.Calendar;

public class MyDate2 {
	
	
	//data hidding(����ȭ)
	private int year;
	private int month;
	private int day;
	
	
	//this => �� 
	//this.month = month; ���� ������ �ִ� month
	
	
	public MyDate2() {
		// TODO Auto-generated constructor stub
		System.out.println("--MyDate2()--");
		//���� �ý��� ��¥ ���ϱ�.(����Ͻú��ʿ���......)
		Calendar c = Calendar.getInstance();
		
		//�⵵ ���ϱ� (����� �Ǿ��ִ�)
		year 	= c.get(Calendar.YEAR);
		month 	= c.get(Calendar.MONTH)+1;
		day 	= c.get(Calendar.DATE);
		//���ϴ� ��¥�� ������ �������� . 
		//���� ���� 1��=0 1 2 3 4 ���� ��ҳ� ?  �� 	
	}
	
	//DRY �ߺ��ڵ带 �ظ��ϸ� ���� ���ƶ�. 1���� ��� .
	//���� �ִ°��� �ҷ��� ���� ���� �ʳ� ?
	//this() �� ���� �ȴ� .
	public MyDate2(int year) {
		
		this();
		System.out.println("--MyDate2(y)--");
		
		this.year = year;
		
//		Calendar c = Calendar.getInstance();
//		month 	= c.get(Calendar.MONTH)+1;
//		day 	= c.get(Calendar.DATE);
	}
	
	//���غ���
	public MyDate2(int year, int month) {
		
		this(year);
		System.out.println("--MyDate2(y m)--");
		
		this.year = year;
		this.month = month;
	}

	public void display() {
		System.out.printf("%d-%02d-%02d\n",year,month,day);
	}
	
	//==========================================================

	public void display_this() {
		System.out.println("��ü���ο��� �ڽ��� �� ���"+ this);
	}
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	

}
