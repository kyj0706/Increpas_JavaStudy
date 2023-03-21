package mymain;

import myutil.MyDate;
import myutil.MyTime;

public class MyMain_MyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//순서12
		String name = new String("홍길동");
		
		
		//순서9
		//이렇게도 쓸수 있다. 그럼 여기에는 객체가 몇개가 있느냐 ~ 
		//3개다.  
		MyDate d1 = new MyDate();
		
		
		//순서4_1(myutil)
		MyTime t1 = new MyTime();
		t1.display();
		
		//순서8_1
		MyTime t2 = new MyTime(11, 12, 30);
		t2.display();
		
		//순서10_1
		MyTime t3 = new MyTime(11);
		t3.display();
		
		//순서11_1
		MyTime t4 = new MyTime(11,49);
		t4.display();
	}

}
