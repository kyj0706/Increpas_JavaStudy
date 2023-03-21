package mymain;

import myutil.MyDate2;

public class MyMain_MyDate2_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyDate2 md1 = new MyDate2();
		
		MyDate2 md2 = new MyDate2();
		
		
		md1.setYear(2022);
		
		md2.setYear(2000);
		
		
		
		System.out.println(md1);
		md1.display_this();
		
		
		md1.display();
		
		MyDate2 md3 = new MyDate2(1999);
		md3.display();
		
		System.out.println("---------------------------");
		
		MyDate2 md4 = new MyDate2(2000, 5);
		md4.display();
		

	}

}
