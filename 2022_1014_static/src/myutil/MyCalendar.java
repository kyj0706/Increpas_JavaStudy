package myutil;

public class MyCalendar {

	
	//single-ton code
	//��ü �������� ���� ���� .
	static MyCalendar single = null;
	
	public static MyCalendar getInstance() {
		
		if(single==null)
			single = new MyCalendar();
		
		return single;
	}
	
	
	
	
	//�⺻������
	private MyCalendar() {
		// TODO Auto-generated constructor stub
		System.out.println("--MyCalender()--");
	}
	
	public void draw_line() {
		System.out.println("-----------");
	}
}
