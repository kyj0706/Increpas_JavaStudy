package mymain;

import myutil.MyDate;
import myutil.MyTime;

public class MyMain_MyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//����12
		String name = new String("ȫ�浿");
		
		
		//����9
		//�̷��Ե� ���� �ִ�. �׷� ���⿡�� ��ü�� ��� �ִ��� ~ 
		//3����.  
		MyDate d1 = new MyDate();
		
		
		//����4_1(myutil)
		MyTime t1 = new MyTime();
		t1.display();
		
		//����8_1
		MyTime t2 = new MyTime(11, 12, 30);
		t2.display();
		
		//����10_1
		MyTime t3 = new MyTime(11);
		t3.display();
		
		//����11_1
		MyTime t4 = new MyTime(11,49);
		t4.display();
	}

}
