package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int year;
		int month;
		String yn="y";
		
			
		MyCalendar mc = new MyCalendar();
		
		while(true) {
		
			System.out.print("��/��:");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			
			//�޷� ��ü���� year/month�� �ѱ��
			mc.setDate(year, month);
			
			
			//�޷����
			mc.display();
			
			
			
			
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}
