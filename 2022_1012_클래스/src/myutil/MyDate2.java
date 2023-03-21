package myutil;

import java.util.Calendar;

public class MyDate2 {
	
	
	//data hidding(은닉화)
	private int year;
	private int month;
	private int day;
	
	
	//this => 나 
	//this.month = month; 내가 가지고 있는 month
	
	
	public MyDate2() {
		// TODO Auto-generated constructor stub
		System.out.println("--MyDate2()--");
		//현재 시스템 날짜 구하기.(년월일시분초요일......)
		Calendar c = Calendar.getInstance();
		
		//년도 구하기 (상수로 되어있다)
		year 	= c.get(Calendar.YEAR);
		month 	= c.get(Calendar.MONTH)+1;
		day 	= c.get(Calendar.DATE);
		//원하는 날짜가 나오지 않을꺼다 . 
		//월의 개념 1월=0 1 2 3 4 으로 잡았네 ?  즉 	
	}
	
	//DRY 중복코드를 왠만하면 쓰지 말아라. 1번만 써라 .
	//위에 있는것을 불러다 쓰면 되지 않냐 ?
	//this() 를 쓰면 된다 .
	public MyDate2(int year) {
		
		this();
		System.out.println("--MyDate2(y)--");
		
		this.year = year;
		
//		Calendar c = Calendar.getInstance();
//		month 	= c.get(Calendar.MONTH)+1;
//		day 	= c.get(Calendar.DATE);
	}
	
	//함해보기
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
		System.out.println("객체내부에서 자신의 값 출력"+ this);
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
