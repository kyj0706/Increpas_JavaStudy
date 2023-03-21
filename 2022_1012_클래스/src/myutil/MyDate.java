package myutil;

public class MyDate {

	
	//순서1
	//변수  : Member field / property / attribute 라고들 한다.
	//		: instance변수(객체가 생성되면 만들어지는 변수)
	public 		int year;
	protected 	int month;
	private 	int day;
				int weekday;
	
				
	//setter method	
	//형식 : set(Field명) <- Camel 표기법
	//내부의 month란 변수에 값는 넣는 메소드
	public void setMonth(int m) {
		month =m;
	}
	
	public void setDay(int d) {
		day = d;
	}
	
	public void setWeekday(int wd) {
		weekday =wd;
	}
	
	//getter method
	//형식 : get(Field명) <- Camel 표기법
	public int getMonth() {
		
		return month;
	}
	
	public int getDay() {
		
		return day;
	}
	
	public int getWeekday() {
		
		return weekday;
	}
	
	
	public void display() {
		System.out.printf("%d-%02d-%02d [%d]요일\n",
				year,month,day,weekday);
		
		
	}
	
}
