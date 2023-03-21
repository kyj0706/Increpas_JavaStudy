package myutil;

public class MyTime {
	
	//혼자 주저리
	//초기화가 된거다 .
	//heap에 만들어지는 순간 0으로 초기화된다
	//누가 ? 생성자가 초기화 시켜준거다.
	//int => 0  double => 0.0  boolean => false  String => null 로
	//그래서 !!  null 이였구만..
	
	//순서3
	//강사
	/*
	 	생성자(Constructor) 메소드
	 	1.객체가 생성될때 !!단1회!! (자동)호출되는 메소드 [시스템에 의해서] 
	 	2.객체 초기화 목적 [만들어지거나 생성하거나 등등]
	 	3.형식)		클래스명()
	 				!!!!반환형이 없다 !!!!!
	 	4.생성자는 Overload(중복메소드)가 가능
	 	5.생성자는 생략 가능하다.->생략시 JVM에 자동생설 처리
	 	
	 	
	 */
	
	//순서1
	//instance 변수
	private int hour;
	private int minute;
	private int second;
	
	//순서4
	//생성자1
	//default constructor(기본생성자) = 인자가 없는
	//초기화의 기능 
	public MyTime() {
		//순서6 한법봅시다
		System.out.println("--MyTime()--");
		//순서7
		hour =minute =second =1;
	}
	
	//순서8
	//생성자2(Overload)선언된 생성자
	public MyTime(int h, int m, int s) {
		
		System.out.println("--MyTime(h,m,s)--");
		hour 	= h;
		minute 	= m;
		second 	= s;
			
	}
	
	
	//순서10
	public MyTime(int h) {
		System.out.println("--MyTime(h)--");
		hour = h;
	}
	
	//순서11
	public MyTime(int h, int m) {
		System.out.println("--MyTime(h,m)--");
		hour = h;
		minute =m;
	}
	 
	
	
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	//순서2
	//Member Method
	//instance method =>객체가 생성되야 만들어진다.
	public void display( ) {
		
		System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
		
		
	}
}
