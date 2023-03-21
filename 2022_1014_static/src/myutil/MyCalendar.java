package myutil;

public class MyCalendar {

	
	//single-ton code
	//객체 생성전에 쓰기 위함 .
	static MyCalendar single = null;
	
	public static MyCalendar getInstance() {
		
		if(single==null)
			single = new MyCalendar();
		
		return single;
	}
	
	
	
	
	//기본생성자
	private MyCalendar() {
		// TODO Auto-generated constructor stub
		System.out.println("--MyCalender()--");
	}
	
	public void draw_line() {
		System.out.println("-----------");
	}
}
