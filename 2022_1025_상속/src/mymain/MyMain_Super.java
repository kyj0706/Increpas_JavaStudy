package mymain;

import myutil.Child;

public class MyMain_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자식객체 호출 
		Child c1 = new Child();
		System.out.println("=======================");
		Child c2 = new Child(2000);
		System.out.println("=======================");
		Child c3 = new Child(2000, 3000);
		
		c1.display();
		c2.display();
		c3.display();
		
	}

}
